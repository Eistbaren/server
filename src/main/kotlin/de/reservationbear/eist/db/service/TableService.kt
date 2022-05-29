package de.reservationbear.eist.db.service

import de.reservationbear.eist.db.entity.RestaurantTable
import de.reservationbear.eist.db.repository.TableRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TableService(val db: TableRepository) {
    fun getTable(uuid: UUID): RestaurantTable = db.getById(uuid)
}