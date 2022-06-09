package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * position on the floor plan
 * @param position
 * @param propertySize
 * @param image
 */
data class TableFloorPlan(

    @field:JsonProperty("position") val position: TableFloorPlanPosition? = null,

    @field:JsonProperty("size") val propertySize: TableFloorPlanPosition? = null,

    @field:JsonProperty("image") val image: java.net.URI? = null
)

