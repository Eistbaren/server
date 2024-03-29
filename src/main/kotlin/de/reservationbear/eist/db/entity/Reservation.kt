package de.reservationbear.eist.db.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonManagedReference
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

    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinTable(
        name = "RESERVATION_RESTAURANT_TABLES",
        joinColumns = [JoinColumn(name = "reservation_id")],
        inverseJoinColumns = [JoinColumn(name = "restaurantTables_id")]
    )
    @JsonManagedReference
    val restaurantTables: Set<RestaurantTable>? = null,

    val reservationFrom: Timestamp,

    val reservationTo: Timestamp,

    val userName: String,

    val userEmail: String,

    var confirmed: Boolean = false,

    @JsonIgnore
    var sendConfirmation: Boolean? = false,

    @JsonIgnore
    var confirmationToken: UUID? = null,

    @JsonIgnore
    var urlFromRequest: String

)
