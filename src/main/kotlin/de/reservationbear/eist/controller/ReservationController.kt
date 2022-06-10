package de.reservationbear.eist.controller

import de.reservationbear.eist.controller.responseMapper.ReservationResponseMapper
import de.reservationbear.eist.controller.responseMapper.TimeslotMapper
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.service.ReservationService
import de.reservationbear.eist.exceptions.ApiException
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
    fun getReservation(@PathVariable("id") id: String): ResponseEntity<ReservationResponseMapper> {
        val reservation: Reservation
        try {
            reservation = reservationService.getReservation(UUID.fromString(id))
        } catch (e: Exception) {
            throw e.message?.let { ApiException(it, 500) }!!
        }
        return ResponseEntity.ok(
            ReservationResponseMapper(
                reservation.id,
                reservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotMapper(reservation.reservationFrom, reservation.reservationTo),
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
            ResponseEntity<ReservationResponseMapper> {

        try {
            reservation.confirmed = false
            reservationService.saveReservation(reservation)
        } catch (e: Exception) {
            throw e.message?.let { ApiException(it, 500) }!!
        }

        val insertedReservation: Reservation = reservation.id?.let { reservationService.getReservation(it) }!!

        return ResponseEntity.ok(
            ReservationResponseMapper(
                insertedReservation.id,
                insertedReservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotMapper(insertedReservation.reservationFrom, insertedReservation.reservationTo),
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
        @RequestParam(value = "confirmationToken", required = true) confirmationToken: String,
        @RequestBody confirmed: Boolean
    ): ResponseEntity<ReservationResponseMapper> {

        val patchedReservation: Reservation

        try {
            patchedReservation = id.let { reservationService.getReservation(UUID.fromString(id)) }
            patchedReservation.confirmed = confirmed
            reservationService.saveReservation(patchedReservation)
        } catch (e: Exception) {
            throw e.message?.let { ApiException(it, 500) }!!
        }

        return ResponseEntity.ok(
            ReservationResponseMapper(
                patchedReservation.id,
                patchedReservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotMapper(patchedReservation.reservationFrom, patchedReservation.reservationTo),
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
    fun deleteReservation(@PathVariable("id") id: String): ResponseEntity<ReservationResponseMapper> {

        val removedReservation: Reservation

        try {
            removedReservation = id.let { reservationService.getReservation(UUID.fromString(id)) }
            reservationService.deleteReservation(UUID.fromString(id))
        } catch (e: Exception) {
            throw e.message?.let { ApiException(it, 500) }!!
        }

        return ResponseEntity.ok(
            ReservationResponseMapper(
                removedReservation.id,
                removedReservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotMapper(removedReservation.reservationFrom, removedReservation.reservationTo),
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
