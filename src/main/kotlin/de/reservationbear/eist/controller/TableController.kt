package de.reservationbear.eist.controller

import de.reservationbear.eist.annotation.WorkInProgress
import de.reservationbear.eist.db.entity.RestaurantTable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * REST-Controller for the table entity
 */
@RestController
@RequestMapping(value = ["/api"])
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
    fun getTable(@PathVariable("id") id: java.util.UUID): ResponseEntity<RestaurantTable> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
