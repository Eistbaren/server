package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import de.reservationbear.eist.db.RestaurantType
import de.reservationbear.eist.db.entity.RestaurantFloorPlan
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

    @field:JsonProperty("name") val name: String? = null,

    @field:JsonProperty("images") val images: List<UUID>? = null,

    @field:JsonProperty("website") val website: URI? = null,

    @field:JsonProperty("openingHours") val openingHours: OpeningHoursMapper? = null,

    @field:JsonProperty("averageRating") val averageRating: Double? = null,

    @field:JsonProperty("priceCategory") val priceCategory: Int? = null,

    @field:JsonProperty("location") val location: RestaurantLocationMapper? = null,
    @JsonIgnore
    val floorPlan: RestaurantFloorPlan? = null,

    @field:JsonProperty("type") val type: RestaurantType? = null,
) {
    @JsonProperty("floorPlan")
    private fun floorPlanMapper(): RestaurantFloorPlanMapper? {
        if (floorPlan == null) {
            return null
        }
        return RestaurantFloorPlanMapper(floorPlan)
    }
}
