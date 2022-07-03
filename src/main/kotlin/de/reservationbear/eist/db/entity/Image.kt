package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonBackReference
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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "image")
    @JsonBackReference
    val tableFloorPlans: Set<TableFloorPlan>,

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "images")
    val restaurantImage: Set<Restaurant>
) : Comparable<Image> {
    override fun compareTo(other: Image): Int {
        return this.id.compareTo(other.id)
    }
}
