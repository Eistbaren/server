package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty
import de.reservationbear.eist.db.entity.TableFloorPlan
import java.util.*

/**
 * Mapper for Table Objects - Maps the return into a compliant schema to the API guideline
 *
 * @param id
 * @param restaurantId
 * @param seats
 * @param floorPlan
 */
data class TableMapper(

    @field:JsonProperty("id") val id: UUID?,

    @field:JsonProperty("restaurantId") val restaurantId: UUID?,

    @field:JsonProperty("seats") val seats: Int?,

    @field:JsonProperty("floorPlan") val floorPlan: TableFloorPlan?,
)