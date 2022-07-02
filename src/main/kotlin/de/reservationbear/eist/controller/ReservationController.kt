package de.reservationbear.eist.controller

import de.reservationbear.eist.controller.responseMapper.ConfirmationMapper
import de.reservationbear.eist.controller.responseMapper.ReservationMapper
import de.reservationbear.eist.controller.responseMapper.TimeslotMapper
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.exceptionhandler.ApiException
import de.reservationbear.eist.service.MailService
import de.reservationbear.eist.service.ReservationService
import de.reservationbear.eist.service.TableService
import org.springframework.core.io.Resource
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import java.util.stream.Collectors

/**
 * REST-Controller for the reservation entity
 */
@RestController
@RequestMapping(value = ["/api"])
class ReservationController(
    val reservationService: ReservationService,
    val tableService: TableService,
    val mailService: MailService
) {

    /**
     * Creates a reservation and pass it to the reservation service
     *
     * @param reservationMapper     Consumes JSON Object and creates a new reservation
     * @return                      ResponseEntity with status and body with JSON
     */
    @PostMapping(
        value = ["/reservation"],
        produces = ["application/json"]
    )
    fun createReservation(
        @RequestBody reservationMapper: ReservationMapper
    ): ResponseEntity<ReservationMapper> {

        val reservation = Reservation(
            null,
            reservationMapper.tables?.stream()
                ?.map { t -> tableService.getTable(t!!) }
                ?.collect(Collectors.toSet())
                ?.toSet(),
            reservationMapper.time!!.from!!,
            reservationMapper.time.to!!,
            reservationMapper.userName!!,
            reservationMapper.userEmail!!,
            false
        )

        if (reservation.restaurantTables == null || reservation.restaurantTables.isEmpty()) {
           throw ApiException("Tablelist cannot be null or error", 401)
        }

        reservationService.saveReservation(reservation)

        val insertedReservation: Reservation = reservation.id?.let { reservationService.getReservation(it) }!!

        mailService.sendRegistrationMail(
            insertedReservation.userEmail,
            insertedReservation.userName,
            insertedReservation.id!!
        )

        return ResponseEntity.ok(
            ReservationMapper(
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
     * Returns a reservation, specified by the id.
     * Edits an existing reservation - is not allowed to create
     *
     * @param id        id of the reservation
     * @return          ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/reservation/{id}"],
        produces = ["application/json"]
    )
    fun getReservation(
        @PathVariable("id") id: UUID
    ): ResponseEntity<ReservationMapper> {

        val reservation: Reservation = reservationService.getReservation(id)

        return ResponseEntity.ok(
            ReservationMapper(
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
     * Edits an existing reservation - is not allowed to create
     *
     * @param id                Id of the reservation
     * @param confirmationToken confirmationToken for the reservation
     * @return                  ResponseEntity with status and body with JSON
     */
    @PatchMapping(
        value = ["/reservation/{id}"],
        produces = ["application/json"]
    )
    fun patchReservation(
        @PathVariable("id") id: UUID,
        @RequestParam(value = "confirmationToken", required = true) confirmationToken: UUID,
        @RequestBody confirmationMapper: ConfirmationMapper
    ): ResponseEntity<ReservationMapper> {

        val patchedReservation: Reservation = reservationService.confirmReservation(id, confirmationToken)

        return ResponseEntity.ok(
            ReservationMapper(
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
     * Removes a reservation from the persistent layer.
     *
     * @param id            id of the reservation
     * @return              ResponseEntity with status and body with JSON
     */
    @DeleteMapping(
        value = ["/reservation/{id}"],
        produces = ["application/json"]
    )
    fun deleteReservation(
        @PathVariable("id") id: UUID
    ): ResponseEntity<ReservationMapper> {

        val removedReservation: Reservation = reservationService.deleteReservation(id)

        return ResponseEntity.ok(
            ReservationMapper(
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
        @PathVariable("id") id: UUID
    ): ResponseEntity<Resource> {
        return ResponseEntity.ok(reservationService.getICSResource(id))
    }
}
