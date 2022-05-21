package de.reservationbear.eist.mockmodels

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 * @param rating 
 * @param comment 
 * @param name 
 */
data class Comment(

    @field:JsonProperty("rating") val rating: Int? = null,

    @field:JsonProperty("comment") val comment: String? = null,

    @field:JsonProperty("name") val name: String? = null
) {

}

