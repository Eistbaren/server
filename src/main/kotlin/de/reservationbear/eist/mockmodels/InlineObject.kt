package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @param confirmationToken
 */
data class InlineObject(

    @field:JsonProperty("confirmationToken") val confirmationToken: String? = null
)

