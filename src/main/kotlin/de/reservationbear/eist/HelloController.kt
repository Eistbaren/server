package de.reservationbear.eist

import de.reservationbear.eist.service.RestaurantService
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.Timestamp
import java.util.*



@RestController
class HelloController(val service: RestaurantService) {
    @GetMapping("sayHello")
    fun sayHello(): String {
        return "Hello World!"
    }
}