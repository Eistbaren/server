package de.reservationbear.eist.service

import de.reservationbear.eist.db.entity.Image
import de.reservationbear.eist.db.repository.ImageRepository
import org.springframework.stereotype.Service
import java.util.*

/**
 * A service to provide specific access to the image values in the database
 */
@Service
class ImageService(val db: ImageRepository) {
    /**
     * Provides the image entity of image uuid
     * @param uuid uuid of the image
     * @return the image object
     */
    fun getImage(uuid: UUID): Image? = db.getById(uuid)
}
