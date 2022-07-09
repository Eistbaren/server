package de.reservationbear.eist.controller

import de.reservationbear.eist.controller.responseMapper.ConfirmationMapper
import de.reservationbear.eist.controller.responseMapper.ReservationMapper
import de.reservationbear.eist.controller.responseMapper.TimeslotMapper
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.entity.RestaurantTable
import de.reservationbear.eist.exceptionhandler.ApiException
import de.reservationbear.eist.service.MailService
import de.reservationbear.eist.service.ReservationService
import de.reservationbear.eist.service.RestaurantService
import de.reservationbear.eist.service.TableService
import org.springframework.core.io.Resource
import org.springframework.data.domain.Pageable.unpaged
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URL
import java.sql.Timestamp
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.util.*
import java.util.regex.Pattern
import java.util.stream.Collectors
import javax.servlet.http.HttpServletRequest

/**
 * REST-Controller for the reservation entity
 */
@RestController
@RequestMapping(value = ["/api"])
class ReservationController(
    val reservationService: ReservationService,
    val restaurantService: RestaurantService,
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
        @RequestBody reservationMapper: ReservationMapper,
        request: HttpServletRequest
    ): ResponseEntity<ReservationMapper> {

        var url = request.getHeader("Origin")
        if (url == null) {
            url = request.getHeader("Referer")
        }
        if (url == null) {
            url = request.requestURL.toString()
        }

        val reservation = Reservation(
            null,
            reservationMapper.tables?.stream()
                ?.map { t -> tableService.getTable(t!!) }
                ?.collect(Collectors.toSet())
                ?.toSet(),
            Timestamp(reservationMapper.time!!.from!! * 1000),
            Timestamp(reservationMapper.time.to!! * 1000),
            reservationMapper.userName!!,
            reservationMapper.userEmail!!,
            urlFromRequest = url
        )

        //Catch reservation with empty table
        if (reservation.restaurantTables == null || reservation.restaurantTables.isEmpty()) {
            throw ApiException("Tablelist cannot be null or error", 400)
        }

        //Catch reservation where due date is lower than 12 hours
        if (reservation.reservationFrom < Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS))) {
            throw ApiException("Reservation must be booked at least 12 hours before", 400)
        }

        //Catch reservation where to is greater then from
        if (reservation.reservationFrom > reservation.reservationTo) {
            throw ApiException("Reservation from cannot be greater than to", 400)
        }

        //Catch invalid name
        if(reservation.userName.split(" ").size < 2){
            throw ApiException("Every name must contain a firstname and a lastname", 400)
        }

        //Catch invalid Email-Address - Source: https://howtodoinjava.com/java/regex/java-regex-validate-email-address/
        val regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"
        val matcher = Pattern.compile(regex).matcher(reservation.userName)
        if (!matcher.matches()) {
            throw ApiException("E-Mail is invalid", 400)
        }

        //Catch if table is booked at the same time
        val restaurantId = reservation.restaurantTables.stream().findFirst().get().restaurant.id
        val reservedTables: HashSet<RestaurantTable>? = restaurantService.findReservationsInTimeframeOfRestaurant(
            restaurantId,
            reservation.reservationFrom,
            reservation.reservationTo,
            unpaged()
        )
            ?.stream()
            ?.map { t -> t?.restaurantTables?.stream() }
            ?.flatMap { t -> t }
            ?.collect(Collectors.toSet()) as HashSet<RestaurantTable>?

        if (reservedTables != null) {
            for (table in reservedTables) {
                if (reservation.restaurantTables.contains(table)) {
                    throw ApiException("Table is already reserved", 400)
                }
            }
        }

        reservationService.saveReservation(reservation)

        val insertedReservation: Reservation = reservation.id?.let { reservationService.getReservation(it) }!!

        mailService.sendRegistrationMail(
            insertedReservation.userEmail,
            insertedReservation.userName,
            URL(insertedReservation.urlFromRequest),
            insertedReservation
        )

        return ResponseEntity.ok(
            ReservationMapper(
                insertedReservation.id,
                insertedReservation.restaurantTables?.map
                { tables -> tables.id }?.toList(),
                TimeslotMapper(
                    insertedReservation.reservationFrom.time / 1000,
                    insertedReservation.reservationTo.time / 1000
                ),
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
                TimeslotMapper(reservation.reservationFrom.time / 1000, reservation.reservationTo.time / 1000),
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

        //Catch reservation where due date is lower than 12 hours and cannot be canceled anymore
        if (patchedReservation.reservationFrom < Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS))) {
            throw ApiException("Reservation cannot be confirmed anymore", 400)
        }

        return ResponseEntity.ok(
            ReservationMapper(
                patchedReservation.id,
                patchedReservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotMapper(
                    patchedReservation.reservationFrom.time / 1000,
                    patchedReservation.reservationTo.time / 1000
                ),
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

        //Catch reservation where due date is lower than 12 hours and cannot be canceled anymore
        if (removedReservation.reservationFrom < Timestamp.from(Instant.now().plus(12, ChronoUnit.HOURS))) {
            throw ApiException("Reservation cannot be canceled anymore", 400)
        }

        return ResponseEntity.ok(
            ReservationMapper(
                removedReservation.id,
                removedReservation.restaurantTables?.map { tables -> tables.id }?.toList(),
                TimeslotMapper(
                    removedReservation.reservationFrom.time / 1000,
                    removedReservation.reservationTo.time / 1000
                ),
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
