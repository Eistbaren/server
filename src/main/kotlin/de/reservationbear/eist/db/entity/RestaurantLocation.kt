package de.reservationbear.eist.db.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class RestaurantLocation(
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
    val lat: Double? = null,
    val lon: Double? = null
)