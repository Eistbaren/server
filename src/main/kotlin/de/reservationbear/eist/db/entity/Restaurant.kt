package de.reservationbear.eist.db.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.net.URI
import java.util.*
import javax.persistence.*

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
    val id: UUID? = null,
    val name: String? = null,
    @OneToMany
    val images: Set<Image>? = null,
    val website: URI? = null,
    @OneToMany
    val openingHours: Set<Timeslot>? = null,
    val averageRating: Double? = null,
    val priceCategory: Int? = null,
    @OneToOne
    val location: RestaurantLocation? = null,
    @OneToOne
    val floorPlan: RestaurantFloorPlan? = null,
    @OneToMany
    val restaurantTables: Set<RestaurantTable>? = null,
    @OneToMany
    val comments: Set<Comment>? = null,
    @OneToMany
    val reservations: Set<Reservation>? = null
)