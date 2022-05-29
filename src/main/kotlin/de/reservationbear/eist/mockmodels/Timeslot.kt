package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @param from
 * @param to
 */
data class Timeslot(

    @field:JsonProperty("from") val from: Int? = null,

    @field:JsonProperty("to") val to: Int? = null
)

