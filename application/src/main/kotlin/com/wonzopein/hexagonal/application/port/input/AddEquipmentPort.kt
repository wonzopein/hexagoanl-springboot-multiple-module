package com.wonzopein.hexagonal.application.port.input

import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.domain.equipment.model.Port

interface AddEquipmentPort {
    fun addEquipment(equipment: Equipment, port: Port)
}