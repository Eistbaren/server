package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 * @param paginated 
 * @param results 
 */
data class InlineResponse2004(

    @field:JsonProperty("Paginated") val paginated: Paginated? = null,

    @field:JsonProperty("results") val results: List<InlineResponse2004Results>? = null
) {

}

