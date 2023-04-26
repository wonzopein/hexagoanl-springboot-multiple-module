package com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.entity

import com.wonzopein.hexagonal.domain.equipment.model.EquipmentType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
class EquipmentEntity:BaseTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null
    var name: String? = null
    var description: String? = null
    var type: EquipmentType = EquipmentType.UNKNOWN
}