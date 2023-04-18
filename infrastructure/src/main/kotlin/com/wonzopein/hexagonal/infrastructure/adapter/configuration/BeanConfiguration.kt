package com.wonzopein.hexagonal.infrastructure.adapter.configuration

import com.wonzopein.hexagonal.application.port.out.EquipmentEventPublisherPort
import com.wonzopein.hexagonal.application.service.EquipmentService
import com.wonzopein.hexagonal.infrastructure.adapter.out.eventpublisher.EquipmentEventPublisherAdapter
import com.wonzopein.hexagonal.infrastructure.adapter.out.persistence.equipment.EquipmentPersistenceAdapter
import com.wonzopein.hexagonal.infrastructure.adapter.out.persistence.equipment.mapper.EquipmentPersistenceMapper
import com.wonzopein.hexagonal.infrastructure.adapter.out.persistence.equipment.repository.EquipmentRepository
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfiguration {

    @Bean
    fun equipmentPersistenceAdapter(
        equipmentRepository: EquipmentRepository,
        equipmentPersistenceMapper: EquipmentPersistenceMapper
    ): EquipmentPersistenceAdapter {
        return EquipmentPersistenceAdapter(equipmentRepository, equipmentPersistenceMapper)
    }

    @Bean
    fun equipmentEventPublisherAdapter(
        applicationEventPublisher: ApplicationEventPublisher
    ):  EquipmentEventPublisherAdapter {
        return EquipmentEventPublisherAdapter(applicationEventPublisher)
    }

    @Bean
    fun equipmentService(
        equipmentPersistenceAdapter: EquipmentPersistenceAdapter,
        equipmentEventPublisherAdapter: EquipmentEventPublisherAdapter
    ): EquipmentService
    {
            return EquipmentService(equipmentPersistenceAdapter, equipmentEventPublisherAdapter)
    }


}