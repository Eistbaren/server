package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.sql.Timestamp
import java.util.*
import javax.persistence.*

/**
 * Represents an open timeslot of a restaurant
 */
@Entity
class Timeslot(
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

    val timeslotFrom: Timestamp,
    
    val timeslotTo: Timestamp,

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurantId")
    @JsonBackReference
    val restaurant: Restaurant
)
