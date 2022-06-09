package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

/**
 *
 * @param tables
 * @param time
 * @param userName
 * @param userEmail
 */
data class ReservationCreationRequest(

    @field:JsonProperty("tables") val tables: List<UUID>? = null,

    @field:JsonProperty("time") val time: Any? = null,

    @field:JsonProperty("userName") val userName: String? = null,

    @field:JsonProperty("userEmail") val userEmail: String? = null
)

