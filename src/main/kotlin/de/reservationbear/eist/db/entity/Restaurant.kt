package de.reservationbear.eist.db.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.net.URI
import java.util.*
import javax.persistence.*

/**
 * Represents a restaurant
 */
@Entity
class Restaurant(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "ID", updatable = false, nullable = false)
    @ColumnDefault("random_uuid()")
    @Type(type = "uuid-char")
    val id: UUID,
    val name: String,
    @OneToMany
    val images: Set<Image>? = null,
    val website: URI? = null,
    @OneToMany
    val openingHours: Set<Timeslot>? = null,
    val averageRating: Double,
    val priceCategory: Int,
    @OneToOne
    val location: RestaurantLocation? = null,
    @OneToOne
    val floorPlan: RestaurantFloorPlan? = null,
    @OneToMany(mappedBy = "restaurant")
    val restaurantTables: Set<RestaurantTable>? = null,
    @OneToMany
    val comments: Set<Comment>? = null,
    @OneToMany
    val reservations: Set<Reservation>? = null
)