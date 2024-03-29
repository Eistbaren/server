package de.reservationbear.eist.controller

import de.reservationbear.eist.controller.responseMapper.*
import de.reservationbear.eist.db.entity.Comment
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.entity.Restaurant
import de.reservationbear.eist.db.entity.RestaurantTable
import de.reservationbear.eist.service.RestaurantService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal
import java.sql.Timestamp
import java.util.*

/**
 * REST-Controller for the restaurant entity.
 */
@RestController
@RequestMapping(value = ["/api"])
class RestaurantController(val restaurantService: RestaurantService) {

    /**
     * Returns a list of restaurants that matches the parameters of the filter.
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
    ): ResponseEntity<PagingResponseMapper> {
        val restaurants: Page<Restaurant> =
            restaurantService.getPageOfFilteredRestaurants(filters, PageRequest.of(currentPage, pageSize))

        return ResponseEntity.ok(
            PagingResponseMapper(
                BigDecimal(restaurants.totalPages),
                BigDecimal(currentPage),
                BigDecimal(pageSize),
                restaurants.get().map { restaurant ->
                    RestaurantMapper(
                        restaurant.id,
                        restaurant.name,
                        restaurant.images?.map { image -> image.id },
                        restaurant.website,
                        OpeningHoursMapper(
                            (restaurant.openingHours?.timeslotFrom?.time ?: 0) / 1000,
                            (restaurant.openingHours?.timeslotTo?.time ?: 0) / 1000
                        ),
                        restaurant.averageRating,
                        restaurant.priceCategory,
                        RestaurantLocationMapper(restaurant.location?.lat ?: 0.0, restaurant.location?.lon ?: 0.0),
                        restaurant.floorPlan,
                        restaurant.type
                    )
                }.toList()
            )
        )
    }

    /**
     * Returns a single restaurant that matches the id in the path variable.
     *
     * @param id            id of the restaurant
     * @return              ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/restaurant/{id}"],
        produces = ["application/json"]
    )
    fun getRestaurant(
        @PathVariable("id") id: UUID,
    ): ResponseEntity<RestaurantMapper> {

        val restaurant: Restaurant = restaurantService.getRestaurant(id)

        return ResponseEntity.ok(
            RestaurantMapper(
                restaurant.id,
                restaurant.name,
                restaurant.images?.map { image -> image.id },
                restaurant.website,
                OpeningHoursMapper(
                    (restaurant.openingHours?.timeslotFrom?.time ?: 0) / 1000,
                    (restaurant.openingHours?.timeslotTo?.time ?: 0) / 1000
                ),
                restaurant.averageRating,
                restaurant.priceCategory,
                RestaurantLocationMapper(restaurant.location?.lat ?: 0.0, restaurant.location?.lon ?: 0.0),
                restaurant.floorPlan,
                restaurant.type
            )
        )
    }

    /**
     * Returns a List with all tables of the restaurant with the given id.
     *
     * @param id                id of the restaurant
     * @param currentPage       page to load
     * @param pageSize          size of one page
     * @return                  ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/restaurant/{id}/table"],
        produces = ["application/json"]
    )
    fun getRestaurantTables(
        @PathVariable("id") id: UUID,
        @RequestParam(value = "currentPage", defaultValue = "0") currentPage: Int,
        @RequestParam(value = "pageSize", defaultValue = "50") pageSize: Int
    ): ResponseEntity<PagingResponseMapper> {
        val tables: Page<RestaurantTable?>? = restaurantService.getPageOfRestaurantTables(
            id,
            PageRequest.of(currentPage, pageSize)
        )
        return ResponseEntity.ok(
            PagingResponseMapper(
                BigDecimal(tables?.totalPages ?: 0),
                BigDecimal(currentPage),
                BigDecimal(pageSize),
                tables
                    ?.map { table ->
                        TableMapper(table)
                    }
                    ?.toList()
            )
        )
    }

    /**
     * Returns a List with all comments of the restaurant with the given id.
     *
     * @param id                id of the restaurant
     * @param currentPage       page to load
     * @param pageSize          size of one page
     * @return                  ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/restaurant/{id}/comment"],
        produces = ["application/json"]
    )
    fun getRestaurantComments(
        @PathVariable("id") id: UUID,
        @RequestParam(value = "currentPage", defaultValue = "0") currentPage: Int,
        @RequestParam(value = "pageSize", defaultValue = "50") pageSize: Int
    ): ResponseEntity<PagingResponseMapper> {

        val comments: Page<Comment?>? = restaurantService.getPageOfRestaurantComments(
            id,
            PageRequest.of(currentPage, pageSize)
        )

        return ResponseEntity.ok(
            PagingResponseMapper(
                BigDecimal(comments?.totalPages ?: 0),
                BigDecimal(currentPage),
                BigDecimal(pageSize),
                comments?.toList() ?: ArrayList<Comment?>()
            )
        )
    }

    /**
     * Returns a list of reservation paginated by the id restaurant.
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
        @PathVariable("id") id: UUID,
        @RequestParam(value = "from", required = true) from: Long,
        @RequestParam(value = "to", required = true) to: Long,
        @RequestParam(value = "currentPage", defaultValue = "0") currentPage: Int,
        @RequestParam(value = "pageSize", defaultValue = "50") pageSize: Int
    ): ResponseEntity<PagingResponseMapper> {

        val reservations: Page<Reservation?>? =
            restaurantService.findReservationsInTimeframeOfRestaurant(
                id,
                Timestamp(from * 1000),
                Timestamp(to * 1000),
                PageRequest.of(currentPage, pageSize)
            )

        return ResponseEntity.ok(
            reservations?.map { reservation ->
                reservation
                    ?.restaurantTables
                    ?.map { table -> table.id }
                    ?.let {
                        RestaurantTableMapper(
                            TimeslotMapper(
                                reservation.reservationFrom.time / 1000,
                                reservation.reservationTo.time / 1000
                            ),
                            it.toList()
                        )
                    }
            }?.let {
                PagingResponseMapper(
                    BigDecimal(reservations.totalPages),
                    BigDecimal(currentPage),
                    BigDecimal(pageSize),
                    it.toList()
                )
            }
        )
    }
}
