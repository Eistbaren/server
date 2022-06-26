package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty

class OpeningHourMapper(
    @field:JsonProperty("from") val from: Int,

    @field:JsonProperty("to") val to: Int
)