package de.reservationbear.eist

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController() {
    @GetMapping("sayHello")
    fun sayHello(): String {
        return "Hello World!"
    }
}