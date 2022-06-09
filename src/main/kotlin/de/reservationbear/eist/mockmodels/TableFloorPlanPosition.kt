package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @param x
 * @param y
 */
data class TableFloorPlanPosition(

    @field:JsonProperty("x") val x: Int? = null,

    @field:JsonProperty("y") val y: Int? = null
)

