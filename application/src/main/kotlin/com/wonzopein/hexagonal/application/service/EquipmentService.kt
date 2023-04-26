package com.wonzopein.hexagonal.application.service

import com.wonzopein.hexagonal.application.port.input.*
import com.wonzopein.hexagonal.application.port.output.EquipmentEventPublisherPort
import com.wonzopein.hexagonal.application.port.output.EquipmentPersistencePort
import com.wonzopein.hexagonal.application.port.output.EquipmentTcpPort
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentCreateEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentDeleteEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentUpdateEvent
import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import java.util.*

class EquipmentService(
    private val equipmentPersistencePort: EquipmentPersistencePort,
    private val equipmentEventPublisherPort: EquipmentEventPublisherPort,
    private val equipmentTcpPort: EquipmentTcpPort
) :
    CreateEquipmentUseCase,
    UpdateEquipmentUseCase,
    DeleteEquipmentUseCase,
    GetEquipmentUseCase{

    override fun createEquipment(equipment: Equipment): Equipment {
        val createdEquipment = equipmentPersistencePort.createEquipment(equipment)
        equipmentEventPublisherPort.publish(EquipmentCreateEvent(createdEquipment.id!!))
        return createdEquipment;
    }

    override fun deleteEquipmentById(id: UUID) {
        equipmentPersistencePort.deleteEquipment(id)
        equipmentEventPublisherPort.publish(EquipmentDeleteEvent(id))
    }

    override fun getEquipmentById(id: UUID): Equipment {
        return equipmentPersistencePort.getEquipment(id)
    }

    override fun updateEquipment(equipment: Equipment) {
        equipmentPersistencePort.updateEquipment(equipment)
        equipmentEventPublisherPort.publish(EquipmentUpdateEvent(equipment.id!!))
    }



}