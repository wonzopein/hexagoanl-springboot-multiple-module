package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.request

import com.wonzopein.hexagonal.domain.equipment.model.EquipmentType
import java.util.UUID

class EquipmentCreateRequest(
    val id: UUID? = null,
    val name: String,
    val description: String,
    var type: EquipmentType
) {
}