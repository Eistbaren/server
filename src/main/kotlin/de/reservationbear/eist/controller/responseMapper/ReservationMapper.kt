package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

/**
 * Mapper for Reservation Response - Maps the return into a compliant schema to the API guideline
 *
 * @param id
 * @param tables
 * @param time
 * @param userName
 * @param userEmail
 * @param confirmed
 */
data class ReservationMapper(

    @field:JsonProperty("id") val id: UUID? = null,

    @field:JsonProperty("tables") val tables: List<UUID?>? = null,

    @field:JsonProperty("time") val time: TimeslotMapper? = null,

    @field:JsonProperty("userName") val userName: String? = null,

    @field:JsonProperty("userEmail") val userEmail: String? = null,

    @field:JsonProperty("confirmed") val confirmed: Boolean? = null
)
