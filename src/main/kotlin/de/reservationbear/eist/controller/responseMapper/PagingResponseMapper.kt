package de.reservationbear.eist.controller.responseMapper

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * Mapper for Paging Responses - Maps the return into a compliant schema to the API guideline
 *
 * @param totalPages
 * @param currentPage
 * @param pageSize
 * @param results
 */
data class PagingResponseMapper(

    @field:JsonProperty("totalPages") val totalPages: BigDecimal? = null,

    @field:JsonProperty("currentPage") val currentPage: BigDecimal? = null,

    @field:JsonProperty("pageSize") val pageSize: BigDecimal? = null,

    @field:JsonProperty("results") val results: List<Any?>? = null
)

