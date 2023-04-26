package com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.entity

import com.wonzopein.hexagonal.domain.equipment.model.EquipmentType
import jakarta.persistence.*
import java.util.*
import kotlin.collections.HashSet

@Entity
class EquipmentEntity:BaseTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null
    var name: String? = null
    var description: String? = null
    var type: EquipmentType = EquipmentType.UNKNOWN

    @OneToMany(mappedBy = "equipment", orphanRemoval = true)
    var ports: List<PortEntity> = listOf()
}