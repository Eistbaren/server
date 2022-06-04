package de.reservationbear.eist

import de.reservationbear.eist.service.RestaurantService
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController(val service: RestaurantService) {
    @GetMapping("sayHello")
    fun sayHello(): String {
        return "Hello World!"
    }

    @GetMapping("DB-TEST")
    fun db(): String {
        val paging: Pageable = PageRequest.of(0, 50)
        val res = service.getPageOfRestaurants(paging)
        val sb: StringBuilder = StringBuilder()
        for (restaurant in res.content)
            sb.append(restaurant.id.toString() + " " + restaurant.name + " " + restaurant.website)

        return sb.toString()
    }
}