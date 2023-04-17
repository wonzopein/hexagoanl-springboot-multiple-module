package com.wonzopein.hexagonal.application.port.`in`

import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import java.util.UUID

interface GetEquipmentUseCase {
    fun getEquipmentById(id: UUID): Equipment
}