package com.wonzopein.hexagonal.infrastructure.adapter.out.persistence.equipment.entity

import com.wonzopein.hexagonal.domain.equipment.model.EquipmentType
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class EquipmentEntity:BaseTimeEntity() {
    @Id
    val id: UUID? = null
    var name: String? = null
    var description: String? = null
    var type: EquipmentType = EquipmentType.UNKNOWN
}