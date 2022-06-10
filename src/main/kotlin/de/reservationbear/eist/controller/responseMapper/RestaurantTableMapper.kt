package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

/**
 * Mapper for Restaurant and Table Object - Maps the return into a compliant schema to the API guideline
 *
 * @param timeslots
 * @param reservedTables
 */
data class RestaurantTableMapper(

    @field:JsonProperty("timeslot") val timeslots: TimeslotMapper? = null,

    @field:JsonProperty("reservedTables") val reservedTables: List<UUID?>? = null
)
