package de.reservationbear.eist.controller.responsewrapper

import com.fasterxml.jackson.annotation.JsonProperty
import java.sql.Timestamp

/**
 *
 * @param from
 * @param to
 */
data class TimeslotWrapper(

    @field:JsonProperty("from") val from: Timestamp? = null,

    @field:JsonProperty("to") val to: Timestamp? = null
)

