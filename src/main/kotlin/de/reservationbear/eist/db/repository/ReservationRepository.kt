package de.reservationbear.eist.db.repository

import de.reservationbear.eist.db.entity.Reservation
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

/**
 * The reservation repository used to manipulate and query values from of the database
 */
interface ReservationRepository : JpaRepository<Reservation, UUID>