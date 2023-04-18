package com.wonzopein.hexagonal.application.port.input

import com.wonzopein.hexagonal.domain.equipment.model.Equipment

interface CreateEquipmentUseCase {
    fun createEquipment(equipment: Equipment): Equipment
}