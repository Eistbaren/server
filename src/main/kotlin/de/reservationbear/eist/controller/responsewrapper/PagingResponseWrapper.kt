package de.reservationbear.eist.controller.responsewrapper

import com.fasterxml.jackson.annotation.JsonProperty
import de.reservationbear.eist.db.entity.RestaurantTable
import org.springframework.data.domain.Page
import java.math.BigDecimal

/**
 *
 * @param totalPages
 * @param currentPage
 * @param pageSize
 * @param results
 */
data class PagingResponseWrapper(

    @field:JsonProperty("totalPages") val totalPages: BigDecimal? = null,

    @field:JsonProperty("currentPage") val currentPage: BigDecimal? = null,

    @field:JsonProperty("pageSize") val pageSize: BigDecimal? = null,

    @field:JsonProperty("results") val results: List<Any?>? = null
)

