package com.wonzopein.hexagonal.infrastructure.adapter.out.persistence.equipment.repository

import com.wonzopein.hexagonal.infrastructure.adapter.out.persistence.equipment.entity.EquipmentEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface EquipmentRepository: JpaRepository<EquipmentEntity, UUID> {
}