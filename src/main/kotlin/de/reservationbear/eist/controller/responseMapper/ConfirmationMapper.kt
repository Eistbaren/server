package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Mapper for reservation confirmation
 *
 * @param confirmed
 */
data class ConfirmationMapper(

    @field:JsonProperty("confirmed") val confirmed: Boolean
)

