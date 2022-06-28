package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

/**
 * Represents a table at a specific restaurant
 */
@Entity
@Table(name = "restaurant_table")
class RestaurantTable(
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

    val seats: Int,

    @OneToOne(fetch = FetchType.EAGER)
    val floorPlan: TableFloorPlan? = null,

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "restaurantTables")
    val reservation: Set<Reservation>,

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference(value = "restaurantTablesRestaurant")
    val restaurant: Restaurant
)
