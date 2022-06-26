package de.reservationbear.eist.db.repository

import de.reservationbear.eist.db.entity.*
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.sql.Timestamp
import java.util.*

/**
 * The restaurant repository used to manipulate and query values from of the database
 */
interface RestaurantRepository : JpaRepository<Restaurant, UUID> {
    /**
     * Searches after comments / short reviews of a given restaurant
     * @param uuid the uuid of the restaurant
     * @param pageable access the database values in batches
     * @return a page of comments
     */
    @Query(
        value = "SELECT r.comments " +
                "FROM Restaurant r " +
                "WHERE r.id = ?1",

        countQuery = "SELECT size(r.comments) " +
                "FROM Restaurant r " +
                "WHERE r.id = ?1",
    )
    fun findCommentsOfRestaurant(uuid: UUID, pageable: Pageable?): Page<Comment?>?

    /**
     * Searches after reservations of a specific restaurant in a given time frame
     * @param uuid the uuid of the restaurant
     * @param from start of the search time frame
     * @param to end of the search time frame
     * @param pageable access the database values in batches
     * @return all reservation of the restaurant in the given time frame
     */
    @Query(
        value = "SELECT r.reservations " +
                "FROM Restaurant r " +
                "JOIN r.reservations rs " +
                "WHERE r.id = ?1 " +
                "AND rs.reservationFrom >= ?2 " +
                "AND rs.reservationTo <= ?3",
        countQuery = "SELECT count(r.reservations) " +
                "FROM Restaurant r " +
                "JOIN r.reservations rs " +
                "WHERE r.id = ?1 " +
                "AND rs.reservationFrom >= ?2 " +
                "AND rs.reservationTo <= ?3",
    )
    fun findReservationsInTimeframeOfRestaurant(
        uuid: UUID,
        from: Timestamp,
        to: Timestamp,
        pageable: Pageable?
    ): Page<Reservation?>?

    /**
     * Searches after the tables of a given restaurant
     * @param uuid the uuid of the restaurant
     * @param pageable access the database values in batches
     * @return a page of tables
     */
    @Query(
        value = "SELECT r " +
                "FROM RestaurantTable r " +
                "WHERE r.restaurant.id = ?1",

        countQuery = "SELECT r " +
                "FROM RestaurantTable r " +
                "WHERE r.restaurant.id = ?1",
    )
    fun findTablesOfRestaurant(uuid: UUID, pageable: Pageable?): Page<RestaurantTable?>?

    /**
     * Searches after the opening hours of a given restaurant
     * @param uuid the uuid of the restaurant
     * @param fromDay the start of the day to query
     * @param fromDay the end of the day to query (normally the next day)
     * @param pageable access the database values in batches
     * @return a page of tables
     */
    @Query(
        value = "SELECT r.openingHours " +
                "FROM Restaurant r " +
                "JOIN r.openingHours oh " +
                "WHERE r.id = ?1 " +
                "AND oh.timeslotFrom >= ?2 " +
                "AND oh.timeslotTo <= ?3",

        countQuery = "SELECT size(r.openingHours) " +
                "FROM Restaurant r " +
                "JOIN r.openingHours oh " +
                "WHERE r.id = ?1 " +
                "AND oh.timeslotFrom >= ?2 " +
                "AND oh.timeslotTo <= ?3",
    )
    fun findTimeslotsInTimeframeOfRestaurant(
        uuid: UUID,
        fromDay: Timestamp,
        toDay: Timestamp,
        pageable: Pageable?
    ): Page<Timeslot?>?
}
