package de.reservationbear.eist.db.entity

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
    val image: Image? = null,

    val x: Int? = null,
    val y: Int? = null,

    val width: Int? = null,
    val height: Int? = null
)
