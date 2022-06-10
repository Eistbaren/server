package de.reservationbear.eist.db.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.sql.Timestamp
import java.util.*
import javax.persistence.*

/**
 * Represents a reservation of at least one table at a restaurant
 */
@Entity
class Reservation(
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
    @OneToMany(fetch = FetchType.EAGER)
    val restaurantTables: Set<RestaurantTable>? = null,
    val reservationFrom: Timestamp,
    val reservationTo: Timestamp,
    val userName: String,
    val userEmail: String,
    var confirmed: Boolean
)