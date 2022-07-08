package de.reservationbear.eist.service

import de.reservationbear.eist.db.entity.*
import de.reservationbear.eist.db.repository.RestaurantRepository
import de.reservationbear.eist.db.type.RestaurantType
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
    fun getPageOfRestaurantComments(uuid: UUID, pageable: Pageable): Page<Comment?>? {
        return db.findCommentsOfRestaurant(uuid, pageable)
    }


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
     * Filter can either be empty or a list of 8 parameters represented by key-value pairs. If a filter should not be
     * used, the filter should be omitted in the http request. Parameters that require an array as value must
     * separate the values inside the array with ;
     * All filters, that are not included in the request are set to the default (null or "").
     * @param filterList list of filters to narrow restaurant search
     * @param pageable for pagination of search results
     */
    fun getPageOfFilteredRestaurants(filterList: List<String>, pageable: Pageable): Page<Restaurant> {
        if (filterList.isEmpty()) {
            return db.findAll(pageable)
        }

        val map: HashMap<String, String> = HashMap()
        filterList.forEach {
            val split = it.split("=")
            if (split.size == 2) {
                map[split[0].trim()] = split[1].trim().removePrefix("[").removeSuffix("]")
            }
        }

        val query = map["query"].orEmpty()
        val type: RestaurantType? = map["type"]?.uppercase()?.let { RestaurantType.valueOf(it) }
        val priceCategory: Int? = map["priceCategory"]?.toIntOrNull()
        val lat: Double? = map["location"]?.split(";")?.getOrNull(0)?.trim()?.toDoubleOrNull()
        val lon: Double? = map["location"]?.split(";")?.getOrNull(1)?.trim()?.toDoubleOrNull()
        val radius: Double? = map["radius"]?.toDoubleOrNull()
        val minimumAverageRating: Double? = map["averageRating"]?.toDoubleOrNull()
        val timeFrom: Date? = map["time"]?.split(";")?.getOrNull(0)?.trim()?.toLongOrNull()?.let { Date(it * 1000) }
        val timeTo: Date? = map["time"]?.split(";")?.getOrNull(1)?.trim()?.toLongOrNull()?.let { Date(it * 1000) }
        val numberVisitors: Int? = map["numberVisitors"]?.toIntOrNull()

        return db.filterRestaurants(
            query, type, priceCategory, minimumAverageRating, timeFrom, timeTo, lat, lon,
            radius, numberVisitors, pageable
        )

    }
}
