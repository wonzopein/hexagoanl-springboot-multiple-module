package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.request

import com.wonzopein.hexagonal.domain.equipment.model.EquipmentType
import com.wonzopein.hexagonal.domain.equipment.model.Port
import java.util.*

class EquipmentUpdateRequest (
    var id: UUID? = null,
    var name: String? = null,
    var description: String? = null,
    var type: EquipmentType = EquipmentType.UNKNOWN,
    var ports: List<Port> = listOf()
)