package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty
import java.net.URI

/**
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
data class Restaurant(

    @field:JsonProperty("id") val id: java.util.UUID? = null,

    @field:JsonProperty("images") val images: List<URI>? = null,

    @field:JsonProperty("website") val website: URI? = null,

    @field:JsonProperty("openingHours") val openingHours: List<Timeslot>? = null,

    @field:JsonProperty("averageRating") val averageRating: Double? = null,

    @field:JsonProperty("priceCategory") val priceCategory: Int? = null,

    @field:JsonProperty("location") val location: RestaurantLocation? = null,

    @field:JsonProperty("floorPlan") val floorPlan: RestaurantFloorPlan? = null
) {

}

