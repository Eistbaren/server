package de.reservationbear.eist.service

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.entity.RestaurantTable
import de.reservationbear.eist.db.repository.ReservationRepository
import de.reservationbear.eist.exceptionhandler.ApiException
import net.fortuna.ical4j.model.Calendar
import net.fortuna.ical4j.model.TimeZoneRegistryFactory
import net.fortuna.ical4j.model.component.VEvent
import net.fortuna.ical4j.model.property.ProdId
import net.fortuna.ical4j.util.RandomUidGenerator
import org.springframework.core.io.ByteArrayResource
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.net.URL
import java.sql.Timestamp
import java.time.Instant
import java.time.ZoneId
import java.time.temporal.ChronoUnit
import java.util.*
import java.util.regex.Pattern
import java.util.stream.Collectors


/**
 * A service to provide specific access to the reservation values in the database
 */
@Service
class ReservationService(
    val db: ReservationRepository,
    val restaurantService: RestaurantService,
    val mailService: MailService
) {
    /**
     * Saves a reservation
     * @param reservation the reservation to save to the database
     * @return the saved reservation
     */
    fun saveReservation(reservation: Reservation): Reservation {

        //Catch reservation with empty table
        if (reservation.restaurantTables == null || reservation.restaurantTables.isEmpty()) {
            throw ApiException("Tablelist cannot be null or error", 400)
        }

        //Catch reservation where due date is lower than 12 hours
        if (reservation.reservationFrom < Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS))) {
            throw ApiException("Reservation must be booked at least 12 hours before", 400)
        }

        //Catch reservation where to is greater then from
        if (reservation.reservationFrom > reservation.reservationTo) {
            throw ApiException("Reservation from cannot be greater than to", 400)
        }

        //Catch invalid name
        if (reservation.userName.split(" ").size < 2) {
            throw ApiException("Every name must contain a firstname and a lastname", 400)
        }

        val restaurant = reservation.restaurantTables.stream().findFirst().get().restaurant

        //Catch reservation outside of business hours
        if (reservation.reservationFrom.toLocalDateTime().hour * 60 + reservation.reservationFrom.toLocalDateTime().minute <
            restaurant.openingHours!!.timeslotFrom.toLocalDateTime().hour * 60 + restaurant.openingHours.timeslotFrom.toLocalDateTime().minute ||
            reservation.reservationFrom.toLocalDateTime().hour * 60 + reservation.reservationFrom.toLocalDateTime().minute >
            restaurant.openingHours.timeslotTo.toLocalDateTime().hour * 60 + restaurant.openingHours.timeslotTo.toLocalDateTime().minute
        ) {
            throw ApiException("Reservation cannot be outside of the opening hours", 400)
        }

        if (reservation.reservationTo.toLocalDateTime().hour * 60 + reservation.reservationTo.toLocalDateTime().minute <
            restaurant.openingHours.timeslotFrom.toLocalDateTime().hour * 60 + restaurant.openingHours.timeslotFrom.toLocalDateTime().minute ||
            reservation.reservationTo.toLocalDateTime().hour * 60 + reservation.reservationTo.toLocalDateTime().minute >
            restaurant.openingHours.timeslotTo.toLocalDateTime().hour * 60 + restaurant.openingHours.timeslotTo.toLocalDateTime().minute
        ) {
            throw ApiException("Reservation cannot be outside of the opening hours", 400)
        }

        //Catch invalid Email-Address
        val regex = "^\\S+@\\S+\\.\\S+\$"
        val matcher = Pattern.compile(regex).matcher(reservation.userEmail)
        if (!matcher.matches()) {
            throw ApiException("E-Mail is invalid", 400)
        }

        //Catch if table is booked at the same time
        val restaurantId = reservation.restaurantTables.stream().findFirst().get().restaurant.id
        val reservedTables: HashSet<RestaurantTable>? = restaurantService.findReservationsInTimeframeOfRestaurant(
            restaurantId,
            reservation.reservationFrom,
            reservation.reservationTo,
            Pageable.unpaged()
        )
            ?.stream()
            ?.map { t -> t?.restaurantTables?.stream() }
            ?.flatMap { t -> t }
            ?.collect(Collectors.toSet()) as HashSet<RestaurantTable>?

        if (reservedTables != null) {
            for (table in reservedTables) {
                if (reservation.restaurantTables.contains(table)) {
                    throw ApiException("Table is already reserved", 400)
                }
            }
        }

        val insertedReservation = db.save(reservation)

        mailService.sendRegistrationMail(
            insertedReservation.userEmail,
            insertedReservation.userName,
            URL(insertedReservation.urlFromRequest),
            insertedReservation
        )

        return insertedReservation
    }

    /**
     * Returns the reservation to search after
     * @param uuid uuid of the reservation
     * @return the reservation object
     */
    fun getReservation(uuid: UUID): Reservation = db.getById(uuid)

    /**
     * Confirms a reservation
     * @param uuid uuid of the reservation
     * @return the saved reservation object
     */

    fun confirmReservation(uuid: UUID, confirmationToken: UUID): Reservation {
        val res = db.getById(uuid)
        //Catch reservation where due date is lower than 12 hours and cannot be canceled anymore
        if (res.reservationFrom < Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS))) {
            throw ApiException("Reservation cannot be confirmed anymore", 400)
        }
        if (res.confirmationToken == null) {
            throw ApiException("Confirmation token is missing", 400)
        }
        if (res.confirmationToken!! != confirmationToken) {
            throw ApiException("Confirmation token is incorrect", 400)
        }
        if (res.reservationFrom < Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS))) {
            throw ApiException("Confirmation token expired", 400)
        }
        res.confirmed = true
        return db.save(res)
    }

    /**
     * Deletes a reservation
     * @param uuid uuid of the reservation
     * @return the hopefully deleted reservation
     */
    fun deleteReservation(uuid: UUID, cancellationReason: String): Reservation {
        val res = db.getById(uuid)

        //Catch reservation where due date is lower than 12 hours and cannot be canceled anymore
        if (res.reservationFrom < Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS)) && res.confirmed) {
            throw ApiException("Reservation cannot be canceled anymore", 400)
        }

        db.deleteById(uuid)
        mailService.sendCancellationMail(
            res.userEmail,
            res.userName,
            cancellationReason,
            res
        )
        return res
    }

    /**
     * Returns all reservations where the confirmationMail has to send out
     *
     * @return a list of reservations
     */
    fun getReservationsForConfirmation(): List<Reservation>? = db.findAllReservations(
        Timestamp.from(Instant.now().plus(24, ChronoUnit.HOURS)),
        Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS))
    )

    /**
     * Returns all reservations that are not confirmed yet and are in the next 12 hours
     *
     * @return a list of reservations
     */
    fun getReservationsForDeletion(): List<Reservation>? =
        db.findAllReservationsForRemove(Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS)))

    /**
     * Returns a resource (ICS File) from the reservation with the given id
     *
     * @param uuid id of the reservation
     * @return ICS-Resource
     */
    fun getICSResource(uuid: UUID): ByteArrayResource {
        val reservation: Reservation = getReservation(uuid)
        return getICS(reservation)
    }

    companion object {
        /**
         * Returns a resource (ICS File) from the reservation with the given id
         *
         * @param reservation   the reservation where you want to get the ICS File from
         * @return              ICS-Resource
         */
        fun getICS(reservation: Reservation): ByteArrayResource {

            val summary: String = if (reservation.restaurantTables == null || reservation.restaurantTables.isEmpty()) {
                "Reservation: table and restaurant missing"
            } else {
                "Reservation: " + (reservation.restaurantTables.first().restaurant.name)
            }

            val calendarEvent = VEvent(
                reservation.reservationFrom.toLocalDateTime().atZone(ZoneId.of("Europe/Berlin")),
                reservation.reservationTo.toLocalDateTime().atZone(ZoneId.of("Europe/Berlin")),
                summary,
            )

            val registry = TimeZoneRegistryFactory.getInstance().createRegistry()
            val calendar = Calendar()
                .withComponent(calendarEvent)
                .withComponent(registry.getTimeZone("Europe/Berlin").vTimeZone)
                // add the from the specification required properties
                .withProperty(RandomUidGenerator().generateUid())
                .withProperty(ProdId("-//Eistbear Calender Event//iCal4j 1.0//EN"))
                .withDefaults()

            val calendarByte = calendar.toString().toByteArray()
            return ByteArrayResource(calendarByte)
        }
    }
}
