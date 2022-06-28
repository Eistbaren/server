package de.reservationbear.eist.controller

import de.reservationbear.eist.controller.responseMapper.ConfirmationMapper
import de.reservationbear.eist.controller.responseMapper.ReservationMapper
import de.reservationbear.eist.controller.responseMapper.TimeslotMapper
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.service.ReservationService
import de.reservationbear.eist.service.TableService
import net.fortuna.ical4j.model.Calendar
import net.fortuna.ical4j.model.component.VEvent
import net.fortuna.ical4j.model.property.ProdId
import net.fortuna.ical4j.util.RandomUidGenerator
import org.springframework.core.io.ByteArrayResource
import org.springframework.core.io.Resource
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import java.util.stream.Collectors

/**
 * REST-Controller for the reservation entity.
 */
@RestController
@RequestMapping(value = ["/api"])
class ReservationController(val reservationService: ReservationService, val tableService: TableService) {

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

        if (reservation.restaurantTables != null && reservation.restaurantTables.isNotEmpty()) {
            reservation.restaurant = reservation.restaurantTables.stream().findFirst().get().restaurant
        } else {
            return ResponseEntity.badRequest().build()
        }

        reservationService.saveReservation(reservation)

        val insertedReservation: Reservation = reservation.id?.let { reservationService.getReservation(it) }!!

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
     * When called, this endpoint patches the attribute "confirmed" on the reservation specified
     * by the PathVariable id to the Boolean value in the RequestBody.
     *
     * @param id                        id of the reservation
     * @param confirmationToken         confirmationToken for the reservation
     * @param confirmationMapper        Set to true when reservation is confirmed
     * @return                          ResponseEntity with status and body with JSON
     */
    @PatchMapping(
        value = ["/reservation/{id}"],
        produces = ["application/json"]
    )
    fun patchReservation(
        @PathVariable("id") id: UUID,
        @RequestParam(value = "confirmationToken", required = true) confirmationToken: String,
        @RequestBody confirmationMapper: ConfirmationMapper
    ): ResponseEntity<ReservationMapper> {

        val patchedReservation: Reservation = reservationService.getReservation(id)
        patchedReservation.confirmed = confirmationMapper.confirmed
        reservationService.saveReservation(patchedReservation)

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

        val removedReservation: Reservation = id.let { reservationService.getReservation(id) }
        reservationService.deleteReservation(id)

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
     * Returns a reservation ics, specified by the id.
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
    ): ResponseEntity<Resource> {
        val reservation: Reservation = id.let { reservationService.getReservation(UUID.fromString(id)) }

        val calendarEvent = VEvent(
            reservation.reservationFrom.toLocalDateTime(),
            reservation.reservationTo.toLocalDateTime(),
            "Reservation: " + reservation.restaurantTables?.first()?.restaurant?.name
        )

        val calendar = Calendar()
            .withComponent(calendarEvent)
            // add the from the specification required properties
            .withProperty(RandomUidGenerator().generateUid())
            .withProperty(ProdId("-//Eistbear Calender Event//iCal4j 1.0//EN"))
            .withDefaults()

        val calendarByte = calendar.toString().toByteArray()
        val resource: Resource = ByteArrayResource(calendarByte)
        return ResponseEntity.ok(resource)
    }
}
