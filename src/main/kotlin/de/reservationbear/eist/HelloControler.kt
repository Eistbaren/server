package de.reservationbear.eist

import de.reservationbear.eist.db.service.RestaurantService
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.Date
import java.sql.Timestamp
import java.util.*


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

    @GetMapping("DB-TEST-2")
    fun db2(): String {
        val paging: Pageable = PageRequest.of(0, 15)
        val res = service.getPageOfRestaurantComments(
            UUID.fromString("069f72db-2157-43de-8e88-21661b518200"), paging
        );
        val sb: StringBuilder = StringBuilder()
        if (res != null) {
            for (comment in res.content)
                if (comment != null) {
                    sb.append(comment.comment + " ")
                }
        }

        return sb.toString()
    }

    @GetMapping("DB-TEST-3")
    fun db3(): String {
        val paging: Pageable = PageRequest.of(0, 15)
        val res = service.findReservationsInTimeframeOfRestaurant(
            UUID.fromString("069f72db-2157-43de-8e88-21661b518200"),
            Timestamp(System.currentTimeMillis()),
            Timestamp(System.currentTimeMillis() + 604800000),
            paging
        );
        val sb: StringBuilder = StringBuilder()
        if (res != null) {
            for (reservation in res.content)
                if (reservation != null) {
                    sb.append(reservation.userName + " ")
                }
        }

        return sb.toString()
    }
}