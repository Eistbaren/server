package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty
import de.reservationbear.eist.db.entity.RestaurantFloorPlan
import de.reservationbear.eist.db.entity.RestaurantLocation
import de.reservationbear.eist.db.entity.Timeslot
import java.net.URI
import java.util.*

/**
 * Mapper for the Restaurant Object - Maps the return into a compliant schema to the API guideline
 *
 * @param id
 * @param images
 * @param website
 * @param openingHours
 * @param averageRating
 * @param priceCategory
 * @param location
 * @param floorPlan
 */
data class RestaurantMapper(

    @field:JsonProperty("id") val id: UUID? = null,

    @field:JsonProperty("images") val images: List<UUID>? = null,

    @field:JsonProperty("website") val website: URI? = null,

    @field:JsonProperty("openingHours") val openingHours: MutableList<Timeslot>? = null,

    @field:JsonProperty("averageRating") val averageRating: Double? = null,

    @field:JsonProperty("priceCategory") val priceCategory: Int? = null,

    @field:JsonProperty("location") val location: RestaurantLocation? = null,

    @field:JsonProperty("floorPlan") val floorPlan: RestaurantFloorPlan? = null
)

