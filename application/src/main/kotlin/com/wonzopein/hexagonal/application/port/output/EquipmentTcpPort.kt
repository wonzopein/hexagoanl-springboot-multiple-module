package com.wonzopein.hexagonal.application.port.output

import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.domain.equipment.model.Port

interface EquipmentTcpPort {
    fun  send(equipment: Equipment, port: Port, message: ByteArray): ByteArray
}