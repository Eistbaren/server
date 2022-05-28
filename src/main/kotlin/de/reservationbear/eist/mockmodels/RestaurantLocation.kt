package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @param lat
 * @param lon
 */
data class RestaurantLocation(

    @field:JsonProperty("lat") val lat: Double? = null,

    @field:JsonProperty("lon") val lon: Double? = null
)

