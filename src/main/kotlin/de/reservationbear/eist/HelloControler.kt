package de.reservationbear.eist

import de.reservationbear.eist.db.service.RestaurantService
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {
    @GetMapping("sayHello")
    fun sayHello(): String {
        return "Hello World!"
    }
}