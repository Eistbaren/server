package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

/**
 * Represents the size of a floor plan of a restaurant
 */
@Entity
class RestaurantFloorPlanSize(
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

    val width: Int,

    val height: Int,

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurantFloorPlanId")
    @JsonBackReference
    val restaurantFloorPlan: RestaurantFloorPlan
)
