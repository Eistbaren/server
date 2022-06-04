package de.reservationbear.eist.controller

import de.reservationbear.eist.controller.responsewrapper.ReservationResponseWrapper
import de.reservationbear.eist.controller.responsewrapper.TimeslotWrapper
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.exceptions.ApiException
import de.reservationbear.eist.mockmodels.ConfirmationToken
import de.reservationbear.eist.service.ReservationService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * REST-Controller for the reservation entity
 */
@RestController
@RequestMapping(value = ["/api"])
class ReservationController(val reservationService: ReservationService) {

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
    fun getReservation(@PathVariable("id") id: String): ResponseEntity<ReservationResponseWrapper> {
        val reservation: Reservation
        try {
            reservation = reservationService.getReservation(UUID.fromString(id))
        } catch (e: Exception) {
            throw e.message?.let { ApiException(it, 500) }!!
        }
        return ResponseEntity.ok(
            ReservationResponseWrapper(
                reservation.id,
                reservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotWrapper(reservation.reservationFrom, reservation.reservationTo),
                reservation.userName,
                reservation.userEmail,
                reservation.confirmed
            )
        )
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
    fun createReservation(@RequestBody reservation: Reservation):
            ResponseEntity<ReservationResponseWrapper> {
        
        reservation.confirmed = false
        
        reservationService.saveReservation(reservation)
        val insertedReservation: Reservation = reservation.id?.let { reservationService.getReservation(it) }!!
        
        return ResponseEntity.ok(
            ReservationResponseWrapper(
                insertedReservation.id,
                insertedReservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotWrapper(insertedReservation.reservationFrom, insertedReservation.reservationTo),
                insertedReservation.userName,
                insertedReservation.userEmail,
                insertedReservation.confirmed
            )
        )
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
        @RequestParam(value = "confirmationToken", required = true) confirmationToken: ConfirmationToken,
        @RequestBody confirmed: Boolean
    ): ResponseEntity<ReservationResponseWrapper> {
        val patchedReservation: Reservation = id.let { reservationService.getReservation(UUID.fromString(id)) }
        patchedReservation.confirmed = confirmed
        reservationService.saveReservation(patchedReservation)
        
        return ResponseEntity.ok(
            ReservationResponseWrapper(
                patchedReservation.id,
                patchedReservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotWrapper(patchedReservation.reservationFrom, patchedReservation.reservationTo),
                patchedReservation.userName,
                patchedReservation.userEmail,
                patchedReservation.confirmed
            )
        )
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
    fun deleteReservation(@PathVariable("id") id: String): ResponseEntity<ReservationResponseWrapper> {
        val removedReservation: Reservation = id.let { reservationService.getReservation(UUID.fromString(id)) }
        reservationService.deleteReservation(UUID.fromString(id))

        return ResponseEntity.ok(
            ReservationResponseWrapper(
                removedReservation.id,
                removedReservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotWrapper(removedReservation.reservationFrom, removedReservation.reservationTo),
                removedReservation.userName,
                removedReservation.userEmail,
                removedReservation.confirmed
            )
        )
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
