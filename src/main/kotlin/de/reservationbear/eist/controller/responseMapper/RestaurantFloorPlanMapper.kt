package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import de.reservationbear.eist.db.entity.RestaurantFloorPlan
import java.util.*
import kotlin.collections.HashMap

/**
 * Mapper for the RestaurantFloorPlan Object - Maps the return into a compliant schema to the API guideline
 */
class RestaurantFloorPlanMapper(
    @JsonIgnore
    val floorPlan: RestaurantFloorPlan?
) {

    @JsonProperty("image")
    val image: UUID? = floorPlan?.image?.id

    @JsonProperty("size")
    private fun size(): HashMap<String, Int>? {
        if (floorPlan?.width == null || floorPlan.height == null) {
            return null;
        }
        val result: HashMap<String, Int> = HashMap()
        result["width"] = floorPlan.width
        result["height"] = floorPlan.height
        return result
    }
}
