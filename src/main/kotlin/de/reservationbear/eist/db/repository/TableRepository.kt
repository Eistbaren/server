package de.reservationbear.eist.db.repository

import de.reservationbear.eist.db.entity.RestaurantTable
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface TableRepository : JpaRepository<RestaurantTable, UUID>