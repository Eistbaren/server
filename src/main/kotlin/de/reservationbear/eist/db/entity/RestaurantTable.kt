package de.reservationbear.eist.db.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

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
    val id: UUID? = null,
    val seats: Int? = null,
    @OneToOne
    val floorPlan: TableFloorPlan? = null
)