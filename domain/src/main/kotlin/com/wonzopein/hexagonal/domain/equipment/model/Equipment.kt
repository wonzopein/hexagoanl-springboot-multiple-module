package com.wonzopein.hexagonal.domain.equipment.model

import java.util.*

class Equipment(
    val id:UUID
) {
    var name: String? = null
    var description: String? = null
    var type: EquipmentType = EquipmentType.UNKNOWN
}