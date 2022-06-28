package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
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
    @ManyToMany(fetch = FetchType.EAGER)
    val images: Set<Image>? = null,
    val website: URI? = null,
    @OneToOne(fetch = FetchType.EAGER)
    val openingHours: Timeslot? = null,
    val averageRating: Double,
    val priceCategory: Int,
    @OneToOne(fetch = FetchType.EAGER)
    val location: RestaurantLocation? = null,
    @OneToOne(fetch = FetchType.EAGER)
    val floorPlan: RestaurantFloorPlan? = null,
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "restaurant")
    @JsonManagedReference(value = "restaurantTablesRestaurant")
    val restaurantTables: Set<RestaurantTable>? = null,
    @OneToMany(fetch = FetchType.EAGER)
    val comments: Set<Comment>? = null,
    @OneToMany(fetch = FetchType.EAGER)
    val reservations: Set<Reservation>? = null
)
