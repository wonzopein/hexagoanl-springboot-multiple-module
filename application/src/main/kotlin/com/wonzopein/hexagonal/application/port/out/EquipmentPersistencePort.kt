package com.wonzopein.hexagonal.application.port.out

import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import java.util.UUID

interface EquipmentPersistencePort {

    fun createEquipment(equipment: Equipment): Equipment

    fun updateEquipment(equipment: Equipment)

    fun deleteEquipment(id:UUID)

    fun getEquipment(id: UUID): Equipment

}