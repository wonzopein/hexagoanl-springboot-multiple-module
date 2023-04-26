package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.mapper

import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.request.EquipmentCreateRequest
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.response.EquipmentCreateResponse
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.response.EquipmentGetResponse
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE, unmappedSourcePolicy = org.mapstruct.ReportingPolicy.IGNORE)
abstract class EquipmentRestMapper {
    abstract fun toEquipment(equipmentCreateRequest: EquipmentCreateRequest): Equipment
    abstract fun toEquipmentCreateResponse(equipment: Equipment): EquipmentCreateResponse
    abstract fun toEquipmentGetResponse(equipment: Equipment): EquipmentGetResponse

//    fun map(code: Int) : EquipmentMode {
//        return EquipmentMode.of(code)
//    }
}