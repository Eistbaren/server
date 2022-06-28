package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

/**
 * Represents the seat plan of a table
 */
@Entity
class TableFloorPlan(
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
    @JsonManagedReference
    val image: Image? = null,

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "tableFloorPlan")
    @JsonManagedReference
    val propertySize: TableFloorPlanPosition? = null,

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurantTableId")
    val restaurantTable: RestaurantTable
)
