package com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.mapper

import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.entity.EquipmentEntity
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface EquipmentPersistenceMapper {
    fun toEntity(equipment: Equipment): EquipmentEntity
    fun toEquipment(equipmentEntity: EquipmentEntity): Equipment
}