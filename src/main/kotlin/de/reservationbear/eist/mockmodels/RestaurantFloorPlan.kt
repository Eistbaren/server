package de.reservationbear.eist.mockmodels


import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @param image image of the floor plan of the restaurant without tables
 * @param propertySize
 */
data class RestaurantFloorPlan(

    @field:JsonProperty("image") val image: java.net.URI? = null,

    @field:JsonProperty("size") val propertySize: RestaurantFloorPlanSize? = null
)

