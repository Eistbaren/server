package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import de.reservationbear.eist.db.RestaurantType
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.SortNatural
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

    @SortNatural
    @OrderBy("id ASC")
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "RESTAURANT_IMAGES",
        joinColumns = [JoinColumn(name = "restaurant_id")],
        inverseJoinColumns = [JoinColumn(name = "image_id")]
    )
    val images: Set<Image>? = null,

    val website: URI? = null,

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "restaurant")
    @JsonManagedReference
    val openingHours: Timeslot? = null,

    val averageRating: Double,

    val priceCategory: Int,

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "restaurant")
    @JsonManagedReference
    val location: RestaurantLocation? = null,

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "restaurant")
    @JsonManagedReference
    val floorPlan: RestaurantFloorPlan? = null,

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "restaurant")
    @JsonManagedReference(value = "restaurantTablesRestaurant")
    val restaurantTables: Set<RestaurantTable>? = null,

    @SortNatural
    @OrderBy("id ASC")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "restaurant")
    @JsonManagedReference
    val comments: Set<Comment>? = null,

    @Enumerated(EnumType.ORDINAL)
    val type: RestaurantType? = null,
)
