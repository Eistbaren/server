package de.reservationbear.eist.db.repository

import de.reservationbear.eist.db.entity.Image
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * The image repository used to manipulate and query values from of the database
 */
@Repository
interface ImageRepository : JpaRepository<Image, UUID>
