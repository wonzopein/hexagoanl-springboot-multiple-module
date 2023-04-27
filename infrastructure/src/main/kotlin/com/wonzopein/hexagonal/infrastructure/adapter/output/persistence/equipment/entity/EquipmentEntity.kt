package com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.entity

import com.wonzopein.hexagonal.domain.equipment.model.EquipmentType
import jakarta.persistence.*
import java.util.*
import kotlin.collections.HashSet

@Entity
class EquipmentEntity: BaseTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null
    var name: String? = null
    var description: String? = null
    var type: EquipmentType = EquipmentType.UNKNOWN

    @OneToMany(mappedBy = "equipment", orphanRemoval = true, cascade = [CascadeType.ALL])
    var ports: MutableList<PortEntity> = mutableListOf()

//    fun addPort(port: PortEntity) {
//        if (port.equipment != null)
//            port.equipment = this
//
//        if(!ports.contains(port))
//            ports.add(port)
//    }
}