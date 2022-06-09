package de.reservationbear.eist.controller.responsewrapper

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

/**
 *
 * @param timeslots
 * @param reservedTables
 */
data class TimeslotTableWrapper(

    @field:JsonProperty("timeslot") val timeslots: TimeslotWrapper? = null,

    @field:JsonProperty("reservedTables") val reservedTables: List<UUID?>? = null
)