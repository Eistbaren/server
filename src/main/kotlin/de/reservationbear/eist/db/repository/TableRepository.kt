package de.reservationbear.eist.db.repository

import de.reservationbear.eist.db.entity.RestaurantTable
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

/**
 * The table repository used to manipulate and query values from of the database
 */
interface TableRepository : JpaRepository<RestaurantTable, UUID>
