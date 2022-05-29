package de.reservationbear.eist.db.service

import de.reservationbear.eist.db.entity.Image
import de.reservationbear.eist.db.repository.ImageRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ImageService(val db: ImageRepository) {
    fun getImage(uuid: UUID): Image = db.getById(uuid)
}