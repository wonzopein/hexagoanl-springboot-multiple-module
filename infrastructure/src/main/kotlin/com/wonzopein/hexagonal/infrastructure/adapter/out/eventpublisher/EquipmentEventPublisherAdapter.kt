package com.wonzopein.hexagonal.infrastructure.adapter.out.eventpublisher

import com.wonzopein.hexagonal.application.port.out.EquipmentEventPublisherPort
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentCreateEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentDeleteEvent
import com.wonzopein.hexagonal.domain.equipment.event.EquipmentUpdateEvent
import org.springframework.context.ApplicationEventPublisher

class EquipmentEventPublisherAdapter(
    private val applicationEventPublisher: ApplicationEventPublisher
): EquipmentEventPublisherPort {
    override fun publish(equipmentCreateEvent: EquipmentCreateEvent) {
        applicationEventPublisher.publishEvent(equipmentCreateEvent)
    }

    override fun publish(equipmentUpdateEvent: EquipmentUpdateEvent) {
        applicationEventPublisher.publishEvent(equipmentUpdateEvent)
    }

    override fun publish(equipmentDeleteEvent: EquipmentDeleteEvent) {
        applicationEventPublisher.publishEvent(equipmentDeleteEvent)
    }

}