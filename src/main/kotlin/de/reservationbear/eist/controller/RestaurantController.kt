package de.reservationbear.eist.controller

import de.reservationbear.eist.mockmodels.Paging
import de.reservationbear.eist.mockmodels.PagingRestaurant
import de.reservationbear.eist.mockmodels.PagingTimeslot
import de.reservationbear.eist.mockmodels.TablesFromRestaurant
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * REST-Controller for the restaurant entity
 */
@RestController
class RestaurantController {

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
        @RequestParam(value = "filters", required = false) filters: List<String>?,
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<Paging> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
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
        @PathVariable("id") id: java.util.UUID,
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<TablesFromRestaurant> {
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
        @RequestParam(value = "from", required = true) from: Int,
        @RequestParam(value = "to", required = true) to: Int,
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<PagingTimeslot> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
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
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<PagingTimeslot> {
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
        @PathVariable("id") id: java.util.UUID,
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<PagingRestaurant> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
