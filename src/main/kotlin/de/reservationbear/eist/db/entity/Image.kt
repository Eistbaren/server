package de.reservationbear.eist.db.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

/**
 * Represents an image to an url
 */
@Entity
class Image(
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

    val imageURL: String,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "RestaurantId")
    val restaurant: Restaurant,

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "image")
    val tableFloorPlans: Set<TableFloorPlan>
)
