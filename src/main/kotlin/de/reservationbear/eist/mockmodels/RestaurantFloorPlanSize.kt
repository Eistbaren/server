package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * size of the floor plan
 * @param width
 * @param height
 */
data class RestaurantFloorPlanSize(

    @field:JsonProperty("width") val width: Int? = null,

    @field:JsonProperty("height") val height: Int? = null
) {

}

