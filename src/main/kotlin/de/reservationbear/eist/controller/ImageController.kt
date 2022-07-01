package de.reservationbear.eist.controller

import de.reservationbear.eist.service.ImageService
import org.springframework.core.io.ByteArrayResource
import org.springframework.core.io.Resource
import org.springframework.http.CacheControl
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.InputStream
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.time.Duration
import javax.servlet.http.HttpServletResponse


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
    fun imageIdGet(@PathVariable("id") uuid: java.util.UUID, response: HttpServletResponse) {
        val image = imageService.getImage(uuid) ?: return
        val inputStream: InputStream? = Thread.currentThread()
            .contextClassLoader
            .getResourceAsStream(image.imageURL.removePrefix("/serverFile/"))
        if (inputStream == null) {
            response.sendError(503, "The file ${image.imageURL} could not be found.")
            return
        }
        response.contentType = "image/png";
        response.setHeader(
            HttpHeaders.CACHE_CONTROL,
            CacheControl.maxAge(Duration.ofMinutes(5))
                .headerValue
        );

        inputStream.transferTo(response.outputStream)
    }
}
