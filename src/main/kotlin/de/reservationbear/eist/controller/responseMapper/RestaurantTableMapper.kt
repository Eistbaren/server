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

    @field:JsonProperty("time") val timeslots: TimeslotMapper? = null,

    @field:JsonProperty("tables") val reservedTables: List<UUID?>? = null
)
