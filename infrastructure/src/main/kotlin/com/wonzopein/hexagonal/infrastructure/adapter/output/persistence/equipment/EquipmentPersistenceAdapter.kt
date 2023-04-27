package com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment

import com.wonzopein.hexagonal.application.port.output.EquipmentPersistencePort
import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.mapper.EquipmentPersistenceMapper
import com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.repository.EquipmentRepository
import org.springframework.transaction.annotation.Transactional
import java.util.*

class EquipmentPersistenceAdapter(
    private val equipmentRepository: EquipmentRepository,
    private val equipmentPersistenceMapper: EquipmentPersistenceMapper
): EquipmentPersistencePort {
    override fun createEquipment(equipment: Equipment): Equipment {
        equipment.id = UUID.randomUUID()
        var equipmentEntity = equipmentPersistenceMapper.toEntity(equipment)
        equipmentEntity = equipmentRepository.save(equipmentEntity)
        return equipmentPersistenceMapper.toEquipment(equipmentEntity)
    }

    override fun updateEquipment(equipment: Equipment) {
        var equipmentEntity = equipmentPersistenceMapper.toEntity(equipment)

        println("${equipmentEntity.id}, ${equipmentEntity.name}, ${equipmentEntity.ports.size}")
        equipmentRepository.save(equipmentEntity)
    }

    override fun deleteEquipment(id: UUID) {
        equipmentRepository.deleteById(id)
    }

    override fun getEquipment(id: UUID): Equipment {
        val equipmentEntity = equipmentRepository.findById(id).get()
        return equipmentPersistenceMapper.toEquipment(equipmentEntity)
    }

}