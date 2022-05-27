package de.reservationbear.eist

import de.reservationbear.eist.db.entities.Comment
import de.reservationbear.eist.db.repositories.CommentRepository
import de.reservationbear.eist.db.services.CommentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val service: CommentService) {
    @GetMapping("sayHello")
    fun sayHello(): String {
        return "Hello World!"
    }

    @GetMapping("DB-TEST")
    fun db(): String {
        return service.findComments().toString();
    }
}