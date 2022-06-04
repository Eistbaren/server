package de.reservationbear.eist.controller

import de.reservationbear.eist.controller.responsewrapper.PagingResponseWrapper
import de.reservationbear.eist.controller.responsewrapper.RestaurantWrapper
import de.reservationbear.eist.controller.responsewrapper.TimeslotTableWrapper
import de.reservationbear.eist.controller.responsewrapper.TimeslotWrapper
import de.reservationbear.eist.db.entity.Comment
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.entity.Restaurant
import de.reservationbear.eist.db.entity.Timeslot
import de.reservationbear.eist.service.RestaurantService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal
import java.sql.Timestamp
import java.util.*
import kotlin.collections.ArrayList

/**
 * REST-Controller for the restaurant entity
 */
@RestController
@RequestMapping(value = ["/api"])
class RestaurantController(val restaurantService: RestaurantService) {

    /**
     * Returns a list of restaurants that matches the parameters of the filter
     * Is the filter empty, every restaurant from the DB is returned.
     *
     * @param filters           tags to filter
     * @param currentPage       page to load
     * @param pageSize          size of one page
     * @return                  ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/restaurant"],
        produces = ["application/json"]
    )
    fun getRestaurants(
        @RequestParam(value = "filters", defaultValue = "") filters: List<String>,
        @RequestParam(value = "currentPage", defaultValue = "0") currentPage: Int,
        @RequestParam(value = "pageSize", defaultValue = "50") pageSize: Int
    ): ResponseEntity<PagingResponseWrapper> {

        val restaurants: Page<Restaurant> =
            restaurantService.getPageOfRestaurants(PageRequest.of(currentPage, pageSize))

        return ResponseEntity.ok(
            PagingResponseWrapper(
                BigDecimal(restaurants.totalPages),
                BigDecimal(currentPage),
                BigDecimal(pageSize),
                restaurants.get().map { restaurant ->
                    RestaurantWrapper(
                        restaurant.id,
                        restaurant.images?.map { image -> image.id },
                        restaurant.website,
                        restaurant.openingHours?.toList() as MutableList<Timeslot>,
                        restaurant.averageRating,
                        restaurant.priceCategory,
                        restaurant.location,
                        restaurant.floorPlan
                    )
                }.toList()
            )
        )
    }

    /**
     * Returns a List with all tables of the restaurant with the given id
     *
     * @param id                id of the restaurant
     * @param currentPage       page to load
     * @param pageSize          size of one page
     * @return                  ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/restaurant/{id}/tables"],
        produces = ["application/json"]
    )
    fun getRestaurantTables(
        @PathVariable("id") id: UUID,
        @RequestParam(value = "currentPage", defaultValue = "0") currentPage: Int,
        @RequestParam(value = "pageSize", defaultValue = "50") pageSize: Int
    ): ResponseEntity<PagingResponseWrapper> {

        //TODO Add missing service

        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * Returns a list of reservation paginated by the id restaurant
     *
     * @param id                id of the restaurant
     * @param from              defines the lower border of the interval the returned reservations lays in
     * @param to                defines the upper border of the interval the returned reservations lays in
     * @param currentPage       page to load
     * @param pageSize          size of one page
     * @return                  ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/restaurant/{id}/reservation"],
        produces = ["application/json"]
    )
    fun getRestaurantReservations(
        @PathVariable("id") id: String,
        @RequestParam(value = "from", required = true) from: Timestamp,
        @RequestParam(value = "to", required = true) to: Timestamp,
        @RequestParam(value = "currentPage", defaultValue = "0") currentPage: Int,
        @RequestParam(value = "pageSize", defaultValue = "50") pageSize: Int
    ): ResponseEntity<PagingResponseWrapper> {

        val reservations: Page<Reservation?>? = restaurantService.findReservationsInTimeframeOfRestaurant(
            UUID.fromString(id),
            from,
            to,
            PageRequest.of(currentPage, pageSize)
        )

        return ResponseEntity.ok(
            reservations?.map { reservation ->
                reservation
                    ?.restaurantTables
                    ?.map { table -> table.id }
                    ?.let {
                        TimeslotTableWrapper(
                            TimeslotWrapper(
                                reservation.reservationFrom,
                                reservation.reservationTo
                            ),
                            it.toList()
                        )
                    }
            }?.let {
                PagingResponseWrapper(
                    BigDecimal(reservations.totalPages),
                    BigDecimal(currentPage),
                    BigDecimal(pageSize),
                    it.toList()
                )
            }
        )
    }

    /**
     * Returns a paginated list of all timeslots on a given date for a given restaurant
     *
     * @param date              date of the timeslots that should be returned
     * @param currentPage       page to load
     * @param pageSize          size of one page
     * @return                  ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/restaurant/{id}/timeslots"],
        produces = ["application/json"]
    )
    fun getRestaurantTimeslots(
        @PathVariable("id") id: String,
        @RequestParam(value = "date", required = true) date: Int,
        @RequestParam(value = "currentPage", defaultValue = "0") currentPage: Int,
        @RequestParam(value = "pageSize", defaultValue = "50") pageSize: Int
    ): ResponseEntity<TimeslotWrapper> {

        //TODO Implement Service

        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * Returns a List with all comments of the restaurant with the given id
     *
     * @param id                id of the restaurant
     * @param currentPage       page to load
     * @param pageSize          size of one page
     * @return                  ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/restaurant/{id}/comments"],
        produces = ["application/json"]
    )
    fun getRestaurantComments(
        @PathVariable("id") id: String,
        @RequestParam(value = "currentPage", defaultValue = "0") currentPage: Int,
        @RequestParam(value = "pageSize", defaultValue = "50") pageSize: Int
    ): ResponseEntity<PagingResponseWrapper> {

        val comments: Page<Comment?>? = restaurantService.getPageOfRestaurantComments(
            UUID.fromString(id),
            PageRequest.of(currentPage, pageSize)
        )

        return ResponseEntity.ok(
            PagingResponseWrapper(
                BigDecimal(comments?.totalPages ?: 0),
                BigDecimal(currentPage),
                BigDecimal(pageSize),
                comments?.toList() ?: ArrayList<Comment?>()
            )
        )
    }
}
