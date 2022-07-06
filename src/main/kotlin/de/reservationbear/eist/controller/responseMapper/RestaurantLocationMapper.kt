package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Mapper for reservation location
 *
 * @param lat
 * @param lon
 */

class RestaurantLocationMapper(
    @field:JsonProperty("lat") val lat: Double,
    @field:JsonProperty("lon") val lon: Double
)
