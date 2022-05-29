package de.reservationbear.eist.db.repository

import de.reservationbear.eist.db.entity.Image
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ImageRepository : JpaRepository<Image, UUID>