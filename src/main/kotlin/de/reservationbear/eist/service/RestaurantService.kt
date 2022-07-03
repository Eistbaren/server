package de.reservationbear.eist.service

import de.reservationbear.eist.db.entity.*
import de.reservationbear.eist.db.repository.RestaurantRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.sql.Timestamp
import java.util.*

/**
 * A service to provide specific access to the restaurant values in the database
 */
@Service
class RestaurantService(val db: RestaurantRepository) {
    /**
     * Search after a page of restaurants
     * @param pageable the page of restaurants
     * @return the page of restaurants
     */
    fun getPageOfRestaurants(pageable: Pageable): Page<Restaurant> = db.findAll(pageable)

    /**
     * Search after a specific restaurant
     * @param uuid uuid of the restaurant
     * @return the restaurant to search after
     */
    fun getRestaurant(uuid: UUID): Restaurant = db.getById(uuid)

    /**
     * Search after a page of restaurant comments
     * @param uuid uuid of the restaurant
     * @param pageable the page of restaurant comments
     * @return the page of restaurant comments
     */
    fun getPageOfRestaurantComments(uuid: UUID, pageable: Pageable): Page<Comment?>? =
        db.findCommentsOfRestaurant(uuid, pageable)

    /**
     * Search after a page of restaurant tables
     * @param uuid uuid of the restaurant
     * @param pageable the page of restaurant tables
     * @return the page of restaurant tables
     */
    fun getPageOfRestaurantTables(uuid: UUID, pageable: Pageable): Page<RestaurantTable?>? =
        db.findTablesOfRestaurant(uuid, pageable)

    /**
     * Find all reservation of a restaurant in a specific timeframe
     * @param uuid uuid of the restaurant
     * @param from the start of the timeframe
     * @param to the end of the timeframe
     * @param pageable
     */
    fun findReservationsInTimeframeOfRestaurant(
        uuid: UUID,
        from: Timestamp,
        to: Timestamp,
        pageable: Pageable
    ): Page<Reservation?>? = db.findReservationsInTimeframeOfRestaurant(uuid, from, to, pageable)

    /**
     * Find all timeslots of a restaurant in a specific timeframe
     * @param uuid uuid of the restaurant
     * @param from the start of the timeframe
     * @param to the end of the timeframe
     * @param pageable
     */
    fun findOpeningHoursInTimeFrameOfRestaurant(
        uuid: UUID,
        from: Timestamp,
        to: Timestamp,
        pageable: Pageable
    ): Page<Timeslot?>? = db.findTimeslotsInTimeframeOfRestaurant(uuid, from, to, pageable)

    /**
     * Find all Restaurants that satisfy the given filters. If no filters where set, returns a page of all restaurants.
     * Filter can either be empty or a list of 10 parameters. If a filter should not be used, the filter should be
     * set to the empty string
     * @param filterList list of filters to narrow restaurant search
     * @param pageable for pagination of search results
     */
    fun getPageOfFilteredRestaurants(filterList: List<String>, pageable: Pageable): Page<Restaurant> {
        if(filterList.isEmpty()) {
            return db.findAll(pageable)
        }

        val query = filterList[0]
        val priceCategory = filterList[2].toIntOrNull()
        val lat = filterList[3].toDoubleOrNull()
        val lon = filterList[4].toDoubleOrNull()
        val radius = filterList[5].toDoubleOrNull()
        val minimumAverageRating = filterList[6].toDoubleOrNull()
        val timeFrom = filterList[7].toLongOrNull()?.let { Date(it * 1000) }
        val timeTo = filterList[8].toLongOrNull()?.let { Date(it * 1000) }
        val numberVisitors = filterList[9].toIntOrNull()

        return db.filterRestaurants(query, priceCategory, minimumAverageRating, timeFrom,
                timeTo, lat, lon, radius, numberVisitors, pageable)
    }
}
