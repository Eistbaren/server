package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @param id
 * @param restaurantId
 * @param seats
 * @param floorPlan
 */
data class Table(

    @field:JsonProperty("id") val id: java.util.UUID? = null,

    @field:JsonProperty("restaurantId") val restaurantId: java.util.UUID? = null,

    @field:JsonProperty("seats") val seats: Int? = null,

    @field:JsonProperty("floorPlan") val floorPlan: TableFloorPlan? = null
) {

}

