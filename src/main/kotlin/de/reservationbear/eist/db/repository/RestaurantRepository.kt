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
        value = "SELECT c " +
                "FROM Comment c " +
                "WHERE c.restaurant.id = ?1",

        countQuery = "SELECT count(c) " +
                "FROM Comment c " +
                "WHERE c.restaurant.id = ?1",
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
        value = "SELECT DISTINCT re " +
                "FROM Restaurant r " +
                "JOIN r.restaurantTables rt " +
                "JOIN rt.reservation re " +
                "WHERE r.id = ?1 " +
                "AND re.reservationFrom >= ?2 " +
                "AND re.reservationTo <= ?3",

        countQuery = "SELECT count(DISTINCT re) " +
                "FROM Restaurant r " +
                "JOIN r.restaurantTables rt " +
                "JOIN rt.reservation re " +
                "WHERE r.id = ?1 " +
                "AND re.reservationFrom >= ?2 " +
                "AND re.reservationTo <= ?3",
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

        countQuery = "SELECT count(r) " +
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
        value = "SELECT t " +
                "FROM Timeslot t " +
                "JOIN t.restaurant r " +
                "WHERE r.id = ?1 " +
                "AND t.timeslotFrom >= ?2 " +
                "AND t.timeslotTo <= ?3",

        countQuery = "SELECT count(t) " +
                "FROM Timeslot t " +
                "JOIN t.restaurant r " +
                "WHERE r.id = ?1 " +
                "AND t.timeslotFrom >= ?2 " +
                "AND t.timeslotTo <= ?3",
    )
    fun findTimeslotsInTimeframeOfRestaurant(
        uuid: UUID,
        fromDay: Timestamp,
        toDay: Timestamp,
        pageable: Pageable?
    ): Page<Timeslot?>?
}
