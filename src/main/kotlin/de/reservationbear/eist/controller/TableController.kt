package de.reservationbear.eist.controller

import de.reservationbear.eist.annotation.WorkInProgress
import de.reservationbear.eist.mockmodels.Table
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * REST-Controller for the table entity
 */
@RestController
class TableController {

    /**
     * Returns a table, specified by the id
     *
     * @param id        id of the table
     * @return          ResponseEntity with status and body with JSON
     */
    @WorkInProgress("Mock")
    @GetMapping(
        value = ["/table/{id}"],
        produces = ["application/json"]
    )
    fun getTable(@PathVariable("id") id: java.util.UUID): ResponseEntity<Table> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
