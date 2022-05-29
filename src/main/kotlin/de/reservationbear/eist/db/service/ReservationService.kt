package de.reservationbear.eist.db.service

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.repository.ReservationRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ReservationService(val db: ReservationRepository) {
    fun post(res: Reservation) {
        db.save(res)
    }

    fun getReservation(uuid: UUID): Reservation = db.getById(uuid)

    fun confirmReservation(uuid: UUID): Reservation {
        val res = db.getById(uuid);
        res.confirmed = true;
        db.save(res)
        return res
    }

    fun deleteReservation(uuid: UUID): Reservation {
        val res = db.getById(uuid)
        db.deleteById(uuid)
        return res
    }

    //TODO: fun getICS(uuid: UUID)
}
