package com.wonzopein.hexagonal.application.port.`in`

import com.wonzopein.hexagonal.domain.equipment.model.Equipment

interface UpdateEquipmentUseCase {
    fun updateEquipment(equipment: Equipment)
}