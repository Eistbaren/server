package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import de.reservationbear.eist.db.entity.RestaurantTable
import java.util.*
import kotlin.collections.HashMap

/**
 * Mapper for Table Objects - Maps the return into a compliant schema to the API guideline
 *
 * @param id
 * @param restaurantId
 * @param seats
 * @param floorPlan
 */
data class TableMapper(
    @JsonIgnore
    val table: RestaurantTable?
) {

    @field:JsonProperty("id")
    val id: UUID? = table?.id

    @field:JsonProperty("restaurantId")
    val restaurantId: UUID? = table?.restaurant?.id

    @field:JsonProperty("seats")
    val seats: Int? = table?.seats

    @JsonProperty("floorPlan")
    private fun floorPlan(): HashMap<String, HashMap<String, Int?>?>? {
        if (table?.floorPlan == null) {
            return null;
        }

        val result: HashMap<String, HashMap<String, Int?>?> = HashMap()

        val position: HashMap<String, Int?> = HashMap()
        position["x"] = table.floorPlan.x
        position["y"] = table.floorPlan.y
        result["position"] = position;

        val size: HashMap<String, Int?> = HashMap()
        size["width"] = table.floorPlan.width
        size["heigth"] = table.floorPlan.heigth
        result["size"] = size;

        return result
    }
}