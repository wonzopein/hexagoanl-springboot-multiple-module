package com.wonzopein.hexagonal.application.port.out

import com.wonzopein.hexagonal.domain.equipment.event.EquipmentCreateEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentDeleteEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentUpdateEvent

interface EquipmentEventPublisherPort {
    fun publish(equipmentCreateEvent: EquipmentCreateEvent)
    fun publish(equipmentUpdateEvent: EquipmentUpdateEvent)
    fun publish(equipmentDeleteEvent: EquipmentDeleteEvent)
}