package com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.entity

import com.wonzopein.hexagonal.domain.equipment.model.Port
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.util.*

@Entity
class PortEntity: BaseTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null
    var host: String = ""
    var port: Int = 0
    var description: String = ""

    @ManyToOne
    var equipment: EquipmentEntity? = null

    override fun equals(other: Any?): Boolean {
        return other is Port && other.id == id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }


}