package com.wonzopein.hexagonal.infrastructure.adapter.`in`.rest.equipment.mapper

import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.infrastructure.adapter.`in`.rest.equipment.data.request.EquipmentCreateRequest
import com.wonzopein.hexagonal.infrastructure.adapter.`in`.rest.equipment.data.response.EquipmentCreateResponse
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
abstract class EquipmentRestMapper {
    abstract fun toDomain(equipmentCreateRequest: EquipmentCreateRequest): Equipment
    abstract fun toData(equipment: Equipment): EquipmentCreateResponse

//    fun map(code: Int) : EquipmentMode {
//        return EquipmentMode.of(code)
//    }
}