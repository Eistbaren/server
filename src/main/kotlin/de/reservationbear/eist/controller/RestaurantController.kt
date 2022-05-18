package de.reservationbear.eist.controller

import de.reservationbear.eist.annotation.WorkInProgress
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.servlet.http.HttpServletResponse


@RestController
class RestaurantController {

    /**
     * Returns a list of restaurants that matches the parameters of the filter
     * Is the filter empty, every restaurant from the DB is returned.
     *
     * @param filter    tags to filter
     * @param page      page to load
     * @param size      size of one page
     * @return          ResponseEntity with status and body with JSON
     */
    @WorkInProgress("Mock")
    @GetMapping(value = ["/restaurant"])
    fun getRestaurants(@RequestParam("filter") filter: List<String>?,
                       @RequestParam("page") page: Int?,
                       @RequestParam("size") size: Int?,
                       uriBuilder: UriComponentsBuilder,
                       response: HttpServletResponse): ResponseEntity<*>? {
        val mockList = ArrayList<String>(arrayOf("Restauran1", "Restaurant2").toList())
        return ResponseEntity.ok<Any>(mockList)
    }

    /**
     * Returns the restaurant with the given id
     *
     * @param id        id of the restaurant
     * @return          ResponseEntity with status and body with JSON
     */
    @WorkInProgress("Mock")
    @GetMapping("/restaurant/{id}")
    fun getRestaurantsById(@PathVariable(name = "id") id: Int): ResponseEntity<*>? {
        return ResponseEntity.ok<Any>("Restaurant Mock mit Id: $id")
    }

    /**
     * Returns a Set? with all pictures
     *
     * @param id        id of the restaurant
     * @return          ResponseEntity with status and body with JSON
     */
    @WorkInProgress("Mock")
    @GetMapping("/restaurant/{id}/picture")
    fun getPictureByRestaurantId(@PathVariable(name = "id") id: Int): ResponseEntity<*>? {
        return ResponseEntity.ok<Any>("Picture mit Id: $id")
    }

    /**
     * Returns a Set? with all pictures
     *
     * @param id        id of the restaurant
     * @return          ResponseEntity with status and body with JSON
     */
    @WorkInProgress("Mock")
    @GetMapping("/restaurant/{id}/table")
    fun getTableByRestaurantId(@PathVariable(name = "id") id: Int): ResponseEntity<*>? {
        val restaurantMap = Array(30) { Array(30) { 0 } }
        return ResponseEntity.ok<Any>(restaurantMap)
    }
}

