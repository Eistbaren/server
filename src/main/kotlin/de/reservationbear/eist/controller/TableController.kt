package de.reservationbear.eist.controller

import de.reservationbear.eist.db.entity.RestaurantTable
import de.reservationbear.eist.service.TableService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * REST-Controller for the table entity
 */
@RestController
@RequestMapping(value = ["/api"])
class TableController(val tableService: TableService) {

    /**
     * Returns a table, specified by the id
     *
     * @param id        id of the table
     * @return          ResponseEntity with status and body with JSON
     */
    @GetMapping(
        value = ["/table/{id}"],
        produces = ["application/json"]
    )
    fun getTable(@PathVariable("id") id: UUID): ResponseEntity<RestaurantTable> {

        val restaurantTable: RestaurantTable = tableService.getTable(id)

        return ResponseEntity.ok(restaurantTable)
    }
}
