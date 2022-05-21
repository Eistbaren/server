package de.reservationbear.eist.controller

import de.reservationbear.eist.mockmodels.InlineResponse200
import de.reservationbear.eist.mockmodels.InlineResponse2001
import de.reservationbear.eist.mockmodels.InlineResponse2002
import de.reservationbear.eist.mockmodels.InlineResponse2003
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

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
    @GetMapping(value = ["/restaurant"], produces = ["application/json"])
    fun getRestaurants(
        @RequestParam(value = "filters", required = false) filters: List<String>?,
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<InlineResponse200> {
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
    @GetMapping(value = ["/restaurant/{id}/tables"], produces = ["application/json"])
    fun getRestaurantTables(
        @PathVariable("id") id: java.util.UUID,
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<InlineResponse2002> {
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
    @GetMapping(value = ["/restaurant/{id}/timeslots"], produces = ["application/json"])
    fun getRestaurantTimeslots(
        @PathVariable("id") id: String,
        @RequestParam(value = "date", required = true) date: Int,
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<InlineResponse2003> {
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
    @GetMapping(value = ["/restaurant/{id}/comments"], produces = ["application/json"])
    fun getRestaurantComments(
        @PathVariable("id") id: java.util.UUID,
        @RequestParam(value = "currentPage", required = false) currentPage: Int?,
        @RequestParam(value = "pageSize", required = false) pageSize: Int?
    ): ResponseEntity<InlineResponse2001> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
