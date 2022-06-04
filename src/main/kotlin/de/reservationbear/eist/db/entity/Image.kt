package de.reservationbear.eist.db.entity

import java.net.URL
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

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
    val imageURL: URL
)