package de.reservationbear.eist.db.service

import de.reservationbear.eist.db.entity.Comment
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.entity.Restaurant
import de.reservationbear.eist.db.repository.RestaurantRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.sql.Timestamp
import java.util.*

@Service
class RestaurantService(val db: RestaurantRepository) {
    fun getPageOfRestaurants(pag: Pageable): Page<Restaurant> = db.findAll(pag)
    fun getRestaurant(uuid: UUID): Restaurant = db.getById(uuid)

    fun getPageOfRestaurantComments(uuid: UUID, pag: Pageable): Page<Comment?>? = db.findCommentsOfRestaurant(uuid, pag)
    fun findReservationsInTimeframeOfRestaurant(
        uuid: UUID,
        from: Timestamp,
        to: Timestamp,
        pag: Pageable
    ): Page<Reservation?>? = db.findReservationsInTimeframeOfRestaurant(uuid, from, to, pag)
}
