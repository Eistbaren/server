package de.reservationbear.eist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EistApplication {

    fun main(args: Array<String>) {
        runApplication<EistApplication>(*args)
    }
}
