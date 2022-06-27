package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty

class RestaurantLocationMapper(
    @field:JsonProperty("lat") val lat: Double,
    @field:JsonProperty("lon") val lon: Double
)
