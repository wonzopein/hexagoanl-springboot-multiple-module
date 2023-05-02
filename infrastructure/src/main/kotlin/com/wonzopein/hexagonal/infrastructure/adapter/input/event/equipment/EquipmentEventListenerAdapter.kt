package com.wonzopein.hexagonal.infrastructure.adapter.input.event.equipment

import com.wonzopein.hexagonal.domain.equipment.event.EquipmentCreateEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentDeleteEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentUpdateEvent
import com.wonzopein.hexagonal.infrastructure.adapter.configuration.logger
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class EquipmentEventListenerAdapter {

    private val log = logger()

    @EventListener
    fun onEquipmentCreated(event: EquipmentCreateEvent) {
        log.info("EquipmentCreatedEvent received: {event.id=${event.id}}")
    }

    @EventListener
    fun onEquipmentUpdated(event: EquipmentUpdateEvent) {
        log.info("EquipmentUpdatedEvent received: {event.id=${event.id}}")
    }

    @EventListener
    fun onEquipmentDeleted(event: EquipmentDeleteEvent) {
        log.info("EquipmentDeletedEvent received: {event.id=${event.id}}")
    }

}