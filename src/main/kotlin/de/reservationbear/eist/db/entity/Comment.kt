package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

/**
 * Represents a comment/ short review of a restaurant
 */
@Entity
class Comment(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "ID", updatable = false, nullable = false)
    @ColumnDefault("random_uuid()")
    @Type(type = "uuid-char")
    @JsonIgnore
    val id: UUID,

    val rating: Int,

    val comment: String,

    val name: String? = null,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "RestaurantId")
    @JsonIgnore
    val restaurant: Restaurant
)
