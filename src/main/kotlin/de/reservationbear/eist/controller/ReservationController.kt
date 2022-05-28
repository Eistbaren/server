package de.reservationbear.eist.controller

import de.reservationbear.eist.mockmodels.InlineObject
import de.reservationbear.eist.mockmodels.Reservation
import de.reservationbear.eist.mockmodels.ReservationCreationRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*

/**
 * REST-Controller for the reservation entity
 */
@RestController
class ReservationController {

    /**
     * Returns a reservation, specified by the id
     *
     * @param id        id of the reservation
     * @return          ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/reservation/{id}"],
        produces = ["application/json"]
    )
    fun getReservation(@PathVariable("id") id: String): ResponseEntity<Reservation> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * Creates a reservation and pass it to the reservation service
     *
     * @param reservation   Consumes JSON Object and creates a new reservation
     * @return              ResponseEntity with status and body with JSON
     */
    @PostMapping(
        value = ["/reservation"],
        produces = ["application/json"]
    )
    fun createReservation(@RequestBody reservation: ReservationCreationRequest):
            ResponseEntity<Reservation> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * Edits an existing reservation - is not allowed to create
     *
     * @param id                Id of the reservation
     * @param confirmationToken confirmationToken for the reservation
     * @param confirmed         Set to true when reservation is confirmed
     * @return                  ResponseEntity with status and body with JSON
     */
    @PatchMapping(
        value = ["/reservation/{id}"],
        produces = ["application/json"]
    )
    fun patchReservation(
        @PathVariable("id") id: String,
        @RequestParam(value = "confirmationToken", required = true) confirmationToken: InlineObject,
        @RequestBody confirmed: Boolean
    ): ResponseEntity<Reservation> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * Removes a reservation from the persistent layer
     *
     * @param id            id of the reservation
     * @return              ResponseEntity with status and body with JSON
     */
    @DeleteMapping(
        value = ["/reservation/{id}"],
        produces = ["application/json"]
    )
    fun deleteReservation(@PathVariable("id") id: String): ResponseEntity<Reservation> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * Returns a reservation ics, specified by the id
     *
     * @param id        id of the reservation
     * @return          ResponseEntity with status and an ICS file
     */
    @GetMapping(
        value = ["/reservation/{id}/ics"],
        produces = ["text/calendar"]
    )
    fun getReservationIcs(
        @PathVariable("id") id: String
    ): ResponseEntity<org.springframework.core.io.Resource> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
