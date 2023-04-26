package com.wonzopein.hexagonal.infrastructure.adapter.configuration

import com.wonzopein.hexagonal.application.service.EquipmentService
import com.wonzopein.hexagonal.infrastructure.adapter.output.eventpublisher.EquipmentEventPublisherAdapter
import com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.EquipmentPersistenceAdapter
import com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.mapper.EquipmentPersistenceMapper
import com.wonzopein.hexagonal.infrastructure.adapter.output.persistence.equipment.repository.EquipmentRepository
import com.wonzopein.hexagonal.infrastructure.adapter.output.tcp.equipment.EquipmentTcpAdapter
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
    fun equipmentTcpAdapter(): EquipmentTcpAdapter {
        return EquipmentTcpAdapter()
    }

    @Bean
    fun equipmentService(
        equipmentPersistenceAdapter: EquipmentPersistenceAdapter,
        equipmentEventPublisherAdapter: EquipmentEventPublisherAdapter,
        equipmentTcpAdapter: EquipmentTcpAdapter
    ): EquipmentService
    {
        return EquipmentService(equipmentPersistenceAdapter, equipmentEventPublisherAdapter, equipmentTcpAdapter)
    }


}