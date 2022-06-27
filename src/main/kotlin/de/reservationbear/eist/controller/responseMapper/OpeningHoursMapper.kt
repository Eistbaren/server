package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Mapper for OpenHours Object - Maps the return into a compliant schema to the API guideline
 *
 * @param from
 * @param to
 */
class OpeningHoursMapper(
    @field:JsonProperty("from") val from: Int,

    @field:JsonProperty("to") val to: Int
)
