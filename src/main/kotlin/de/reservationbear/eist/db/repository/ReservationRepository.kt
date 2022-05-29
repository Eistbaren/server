package de.reservationbear.eist.db.repository

import de.reservationbear.eist.db.entity.Reservation
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ReservationRepository : JpaRepository<Reservation, UUID>