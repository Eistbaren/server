package de.reservationbear.eist.controller

import de.reservationbear.eist.service.ImageService
import org.springframework.core.io.ByteArrayResource
import org.springframework.core.io.Resource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path


/**
 * REST-Controller for the Images.
 */
@RestController
@RequestMapping(value = ["/api"])
class ImageController(val imageService: ImageService) {

    /**
     * Returns an image, specified by the id.
     *
     * @param uuid id of the reservation
     * @return ResponseEntity with status and body with the image ressorce
     */
    @GetMapping(
        value = ["/image/{id}"],
        produces = [MediaType.IMAGE_PNG_VALUE]
    )
    fun imageIdGet(@PathVariable("id") uuid: java.util.UUID):
            ResponseEntity<Resource> {
        val image = imageService.getImage(uuid) ?: return ResponseEntity.notFound().build()

        val systemResource: URL =
            ClassLoader.getSystemResource(image.imageURL.removePrefix("/serverFile/"))
                ?: return ResponseEntity.notFound().build()
        val imagePath: Path = Path.of(systemResource.toURI())
        val imageResource = ByteArrayResource(Files.readAllBytes(imagePath))

        return ResponseEntity.ok(imageResource)
    }
}
