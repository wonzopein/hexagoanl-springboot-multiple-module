package com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment

import com.wonzopein.hexagonal.application.port.output.EquipmentPersistencePort
import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.mapper.EquipmentPersistenceMapper
import com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.repository.EquipmentRepository
import java.util.*

class EquipmentPersistenceAdapter(
    private val equipmentRepository: EquipmentRepository,
    private val equipmentPersistenceMapper: EquipmentPersistenceMapper
): EquipmentPersistencePort {
    override fun createEquipment(equipment: Equipment): Equipment {
        TODO("Not yet implemented")
    }

    override fun updateEquipment(equipment: Equipment) {
        TODO("Not yet implemented")
    }

    override fun deleteEquipment(id: UUID) {
        TODO("Not yet implemented")
    }

    override fun getEquipment(id: UUID): Equipment {
        TODO("Not yet implemented")
    }

}