package com.wonzopein.hexagonal.domain.equipment.model

import java.util.*
import kotlin.collections.HashSet

class Equipment{
    var id:UUID? = null
    var name: String? = null
    var description: String? = null
    var type: EquipmentType = EquipmentType.UNKNOWN
    private val ports: List<Port> = listOf()
}