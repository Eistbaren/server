package de.reservationbear.eist.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * REST-Controller for the Images
 */
@RestController
class ImageController() {


    /**
     * Returns an image, specified by the id
     *
     * @param id        id of the reservation
     * @return          ResponseEntity with status and body with the image ressorce
     */
    @GetMapping(
        value = ["/image/{id}"],
        produces = ["application/image"]
    )
    fun imageIdGet(@PathVariable("id") id: java.util.UUID):
            ResponseEntity<org.springframework.core.io.Resource> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
