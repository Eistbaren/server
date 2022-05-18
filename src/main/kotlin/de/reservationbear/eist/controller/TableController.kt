package de.reservationbear.eist.controller

import de.reservationbear.eist.annotation.WorkInProgress
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
@RestController
class TableController {

    /**
     * Returns a table, specified by the id
     *
     * @param id        id of the table
     * @return          ResponseEntity with status and body with JSON
     */
    @WorkInProgress("Mock")
    @GetMapping(value = ["/taböe/{id}"])
    fun getTableById(@PathVariable(name = "id") id: Int): ResponseEntity<*>? {
        return ResponseEntity.ok<Any>("Table")
    }

}