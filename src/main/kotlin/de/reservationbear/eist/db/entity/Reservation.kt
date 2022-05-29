package de.reservationbear.eist.db.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.sql.Timestamp
import java.util.*
import javax.persistence.*

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
    @OneToMany
    val restaurantTables: Set<RestaurantTable>? = null,
    val reservationFrom: Timestamp? = null,
    val reservationTo: Timestamp? = null,
    val userName: String? = null,
    val userEmail: String? = null,
    var confirmed: Boolean
)