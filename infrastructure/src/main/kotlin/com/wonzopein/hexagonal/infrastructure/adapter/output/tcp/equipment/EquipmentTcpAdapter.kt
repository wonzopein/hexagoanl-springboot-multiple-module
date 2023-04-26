package com.wonzopein.hexagonal.infrastructure.adapter.output.tcp.equipment

import com.wonzopein.hexagonal.application.port.output.EquipmentTcpPort
import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.domain.equipment.model.Port

class EquipmentTcpAdapter: EquipmentTcpPort {

    override fun send(equipment: Equipment, port: Port, message: ByteArray): ByteArray {
        TODO("Not yet implemented")
    }

}