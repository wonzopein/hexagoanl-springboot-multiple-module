package com.wonzopein.hexagonal.domain.equipment.model

import java.util.*

class Equipment {
    var id: UUID? = null
    var name: String? = null
    var description: String? = null
    var type: EquipmentType = EquipmentType.UNKNOWN
}