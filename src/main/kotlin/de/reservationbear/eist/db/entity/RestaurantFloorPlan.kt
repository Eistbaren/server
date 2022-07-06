package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

/**
 * Represents the floor plan of a restaurant
 */
@Entity
class RestaurantFloorPlan(
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "imageId")
    val image: Image? = null,

    val width: Int?,
    val height: Int?,

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurantId")
    @JsonBackReference
    val restaurant: Restaurant
)
