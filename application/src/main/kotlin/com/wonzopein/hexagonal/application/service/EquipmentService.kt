package com.wonzopein.hexagonal.application.service

import com.wonzopein.hexagonal.application.port.`in`.CreateEquipmentUseCase
import com.wonzopein.hexagonal.application.port.`in`.DeleteEquipmentUseCase
import com.wonzopein.hexagonal.application.port.`in`.GetEquipmentUseCase
import com.wonzopein.hexagonal.application.port.`in`.UpdateEquipmentUseCase
import com.wonzopein.hexagonal.application.port.out.EquipmentEventPublisherPort
import com.wonzopein.hexagonal.application.port.out.EquipmentPersistencePort
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentCreateEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentDeleteEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentUpdateEvent
import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import java.util.*

class EquipmentService(
    private val equipmentPersistencePort: EquipmentPersistencePort,
    private val equipmentEventPublisherPort: EquipmentEventPublisherPort
) :
    CreateEquipmentUseCase,
    UpdateEquipmentUseCase,
    DeleteEquipmentUseCase,
    GetEquipmentUseCase {

    /**
     * 설비 생성
     */
    override fun createEquipment(equipment: Equipment): Equipment {
        val createdEquipment = equipmentPersistencePort.createEquipment(equipment)
        equipmentEventPublisherPort.publish(EquipmentCreateEvent(createdEquipment.id))
        return createdEquipment;
    }

    /**
     * 설비 삭제
     */
    override fun deleteEquipmentById(id: UUID) {
        equipmentPersistencePort.deleteEquipment(id)
        equipmentEventPublisherPort.publish(EquipmentDeleteEvent(id))
    }

    /**
     * 설비 조회
     */
    override fun getEquipmentById(id: UUID): Equipment {
        return equipmentPersistencePort.getEquipment(id)
    }

    /**
     * 설비 수정
     */
    override fun updateEquipment(equipment: Equipment) {
        equipmentPersistencePort.updateEquipment(equipment)
        equipmentEventPublisherPort.publish(EquipmentUpdateEvent(equipment.id))
    }
}