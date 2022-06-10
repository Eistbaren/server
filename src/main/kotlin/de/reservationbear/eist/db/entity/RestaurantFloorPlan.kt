package de.reservationbear.eist.db.entity

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
    val image: Image? = null,
    @OneToOne(fetch = FetchType.EAGER)
    val propertySize: RestaurantFloorPlanSize
)
