package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

/**
 * 
 * @param timeslot 
 * @param reservedTables ids of the reserved tables of the timeslot
 */
data class TimeslotsFromTable(

    @field:JsonProperty("timeslot") val timeslot: Timeslot? = null,

    @field:JsonProperty("reservedTables") val reservedTables: List<UUID>? = null
)

