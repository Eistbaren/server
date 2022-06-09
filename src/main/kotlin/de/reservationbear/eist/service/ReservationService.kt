package de.reservationbear.eist.service

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.repository.ReservationRepository
import org.springframework.stereotype.Service
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

    //TODO: fun getICS(uuid: UUID)
}
