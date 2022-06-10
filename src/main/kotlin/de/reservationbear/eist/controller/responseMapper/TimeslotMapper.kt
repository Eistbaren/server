package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty
import java.sql.Timestamp

/**
 * Mapper for Timeslot Object - Maps the return into a compliant schema to the API guideline
 *
 * @param from
 * @param to
 */
data class TimeslotMapper(

    @field:JsonProperty("from") val from: Timestamp? = null,

    @field:JsonProperty("to") val to: Timestamp? = null
)

