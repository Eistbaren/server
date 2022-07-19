package de.reservationbear.eist.db.repository

import de.reservationbear.eist.db.entity.Reservation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.sql.Timestamp
import java.util.*

/**
 * The reservation repository used to manipulate and query values from of the database
 */
interface ReservationRepository : JpaRepository<Reservation, UUID> {

    /**
     * Searches after all reservations between from and to
     * @param from      timestamp of beginning time (default: current time)
     * @param to        begin of the reservation
     * @return          a list of reservations
     */
    @Query(
        value = "SELECT r " +
                "FROM Reservation r " +
                "WHERE r.confirmed <> true " +
                "AND r.reservationFrom <= ?1 " +
                "AND r.reservationFrom >= ?2 " +
                "AND r.sendConfirmation <> true "
    )
    fun findAllReservations(from: Timestamp, to: Timestamp): List<Reservation>?

    /**
     * Searches after all reservations between from and to
     * @param from      timestamp of beginning time (default: current time)
     * @return          a list of reservations
     */

    @Query(
        value = "SELECT r " +
                "FROM Reservation r " +
                "WHERE r.confirmed <> true " +
                "AND r.reservationFrom <= ?1 "
    )
    fun findAllReservationsForRemove(from: Timestamp?): List<Reservation>?
}
