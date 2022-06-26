package de.reservationbear.eist.service

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.repository.ReservationRepository
import net.fortuna.ical4j.model.Calendar
import net.fortuna.ical4j.model.component.VEvent
import net.fortuna.ical4j.model.property.ProdId
import net.fortuna.ical4j.util.RandomUidGenerator
import org.springframework.core.io.ByteArrayResource
import org.springframework.core.io.Resource
import org.springframework.stereotype.Service
import java.sql.Timestamp
import java.util.*

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
    fun confirmReservation(uuid: UUID): Reservation {
        val res = db.getById(uuid)
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
     * @param to Timestamp of latest reservation that should be confirmed
     * @return a list of reservations
     */
    fun getReservationsForConfirmation(to: Timestamp): List<Reservation>? = db.findAllReservations(Timestamp.from(java.time.Instant.now()), to)

    /**
     * Returns a resource (ICS File) from the reservation with the given id
     *
     * @param id id of the reservation
     * @return ICS-Resource
     */
    fun getICSResource(id: UUID): ByteArrayResource {
        val reservation: Reservation = getReservation(id)

        //Null restaurantTables to prevent error
        if(reservation.restaurantTables?.isEmpty() == true){
            reservation.restaurantTables = null
        }

        val calendarEvent = VEvent(
            reservation.reservationFrom.toLocalDateTime(),
            reservation.reservationTo.toLocalDateTime(),
            "Reservation: " + reservation.restaurantTables
                ?.first()
                ?.restaurant
                ?.name
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
