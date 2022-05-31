package de.reservationbear.eist.db.entity

import java.net.URL
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

/**
 * Represents a image to a url
 */
@Entity
class Image(
    @Id
    val id: UUID,
    val imageURL: URL
)