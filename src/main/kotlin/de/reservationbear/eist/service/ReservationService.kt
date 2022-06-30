package de.reservationbear.eist.service

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.repository.ReservationRepository
import de.reservationbear.eist.exceptionhandler.ApiException
import net.fortuna.ical4j.model.Calendar
import net.fortuna.ical4j.model.component.VEvent
import net.fortuna.ical4j.model.property.ProdId
import net.fortuna.ical4j.util.RandomUidGenerator
import org.springframework.core.io.ByteArrayResource
import org.springframework.core.io.Resource
import org.springframework.stereotype.Service
import java.sql.Timestamp
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.time.temporal.TemporalUnit
import java.util.*
import kotlin.jvm.Throws

/**
 * A service to provide specific access to the reservation values in the database
 */
@Service
class ReservationService(val db: ReservationRepository) {
    /**
     * Saves a reservation
     * @param reservation the reservation to save to the database
     * @return the saved reservation
     */
    fun saveReservation(reservation: Reservation): Reservation = db.save(reservation)

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
        if (res.confirmationToken == null) {
            throw ApiException("Confirmation token is missing", 400)
        }
        if(res.confirmationToken!! != confirmationToken){
            throw ApiException("Confirmation token is incorrect", 400)
        }
        if(res.reservationFrom < Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS))){
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
    fun deleteReservation(uuid: UUID): Reservation {
        val res = db.getById(uuid)
        db.deleteById(uuid)
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
     * Returns a resource (ICS File) from the reservation with the given id
     *
     * @param id id of the reservation
     * @return ICS-Resource
     */
    fun getICSResource(id: UUID): ByteArrayResource {
        val reservation: Reservation = getReservation(id)

        val summary : String = if(reservation.restaurantTables == null || reservation.restaurantTables.isEmpty()){
            "Reservation: table and restaurant missing"
        } else {
            "Reservation: " + (reservation.restaurantTables
                .first()
                .restaurant
                .name)
        }

        val calendarEvent = VEvent(
            reservation.reservationFrom.toLocalDateTime(),
            reservation.reservationTo.toLocalDateTime(),
            summary
        )

        val calendar = Calendar()
            .withComponent(calendarEvent)
            // add the from the specification required properties
            .withProperty(RandomUidGenerator().generateUid())
            .withProperty(ProdId("-//Eistbear Calender Event//iCal4j 1.0//EN"))
            .withDefaults()

        val calendarByte = calendar.toString().toByteArray()
        return ByteArrayResource(calendarByte)
    }
}
