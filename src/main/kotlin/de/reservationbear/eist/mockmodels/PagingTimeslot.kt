package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 * @param paginated 
 * @param results 
 */
data class PagingTimeslot(

    @field:JsonProperty("Paginated") val paginated: Paginated? = null,

    @field:JsonProperty("results") val results: List<List<Any>>? = null
)

