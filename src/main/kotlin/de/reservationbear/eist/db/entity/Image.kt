package de.reservationbear.eist.db.entity

import java.net.URL
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Image(
    @Id
    val id: UUID,
    val imageURL: URL
)