package de.reservationbear.eist.db.service

import de.reservationbear.eist.db.entity.RestaurantTable
import de.reservationbear.eist.db.repository.TableRepository
import org.springframework.stereotype.Service
import java.util.*

/**
 * A service to provide specific access to the table values in the database
 */
@Service
class TableService(val db: TableRepository) {
    /**
     * Search after a table
     * @param uuid the uuid of the table
     * @return the table object
     */
    fun getTable(uuid: UUID): RestaurantTable = db.getById(uuid)
}