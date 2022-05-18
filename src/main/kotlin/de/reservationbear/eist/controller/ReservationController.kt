package de.reservationbear.eist.controller

import de.reservationbear.eist.annotation.WorkInProgress
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class ReservationController {

    /**
     * Returns a reservation, specified by the id
     *
     * @param id        id of the  reservation
     * @return          ResponseEntity with status and body with JSON
     */
    @WorkInProgress("Mock")
    @GetMapping(value = ["/reservation/{id}"])
    fun getReservationById(@PathVariable(name = "id") id: Int): ResponseEntity<*>? {
        return ResponseEntity.ok<Any>("Reservation")
    }

    /**
     * Creates a reservation and pass it to the reservation service
     *
     * @param reservation   Consumes JSON Object and creates a new reservation
     * @return              ResponseEntity with status and body with JSON
     */
    @PostMapping(value = ["/reservation"], consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun addNewReservation(@RequestBody reservation: String?): ResponseEntity<*>? {
        return ResponseEntity.ok<Any>(reservation)
    }

    /**
     * Edits an existing reservation - is not allowed to create
     *
     * @param id            id of the reservation
     * @param reservation   Consumes JSON Object and overwrites all given parameters
     * @return              ResponseEntity with status and body with JSON
     */
    @PutMapping(value = ["/reservation/{id}"], consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun editReservation(@PathVariable(name = "id") id: Int, @RequestBody reservation: String?): ResponseEntity<*>? {
        return ResponseEntity.ok<Any>("$reservation with $id was changed")
    }

    /**
     * Removes a reservation from the persistent layer
     *
     * @param id            id of the reservation
     * @return              ResponseEntity with status and body with JSON
     */
    @DeleteMapping(value = ["/reservation/{id}"])
    fun deleteReservation(@PathVariable(name = "id") id: Int): ResponseEntity<*>? {
        return ResponseEntity.ok<Any>("reservation with $id was removed")
    }
}