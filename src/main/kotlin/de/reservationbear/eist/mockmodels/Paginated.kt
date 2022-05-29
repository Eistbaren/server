package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @param totalPages
 * @param currentPage
 * @param pageSize
 * @param results
 */
data class Paginated(

    @field:JsonProperty("totalPages") val totalPages: java.math.BigDecimal? = null,

    @field:JsonProperty("currentPage") val currentPage: java.math.BigDecimal? = null,

    @field:JsonProperty("pageSize") val pageSize: java.math.BigDecimal? = null,

    @field:JsonProperty("results") val results: List<Any>? = null
)

