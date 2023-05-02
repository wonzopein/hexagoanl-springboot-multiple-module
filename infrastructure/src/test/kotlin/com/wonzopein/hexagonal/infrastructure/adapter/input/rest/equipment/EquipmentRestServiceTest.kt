package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment

import com.fasterxml.jackson.databind.ObjectMapper
import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import com.wonzopein.hexagonal.domain.equipment.model.EquipmentType
import com.wonzopein.hexagonal.domain.equipment.model.Port
import com.wonzopein.hexagonal.infrastructure.adapter.configuration.logger
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.request.EquipmentCreateRequest
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.request.EquipmentUpdateRequest
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.mapper.EquipmentRestMapper
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.transaction.annotation.Transactional
import java.util.*

@ExtendWith(SpringExtension::class)
@SpringBootTest
class EquipmentRestServiceTest(
    @Autowired val objectMapper: ObjectMapper,
    @Autowired val equipmentRestService: EquipmentRestService,
    @Autowired val equipmentRestMapper: EquipmentRestMapper
) {

    var log = logger()

    fun createEquipmentInner(): Equipment {
        val createRequest =
            equipmentRestMapper.toEquipment(EquipmentCreateRequest(null, "Test Equipment1", "", EquipmentType.UNKNOWN))
        return equipmentRestService.createEquipment(createRequest)
    }

    @Test
    fun createEquipment() {
        val equipment = createEquipmentInner()
        assertNotNull(equipment)
        log.debug("equipment=${objectMapper.writeValueAsString(equipment)}")
    }

    @Test
    fun updateEquipment() {
        val equipment = createEquipmentInner()
        log.debug("equipment=${objectMapper.writeValueAsString(equipment)}")
        equipment.ports.add(Port(UUID.randomUUID(), "192.168.0.1", 8000,))
        equipmentRestService.updateEquipment(equipment)
    }

    @Test
    @Transactional
    fun getEquipment() {
        val createEquipment = createEquipmentInner()
        val equipment= equipmentRestService.getEquipment(createEquipment.id!!)
        assertNotNull(equipment)
        log.debug("equipment=${objectMapper.writeValueAsString(equipment)}")
    }

    @Test
    fun deleteEquipment() {
        val createEquipment = createEquipmentInner()
        createEquipment.ports.add(Port(UUID.randomUUID(), "192.168.0.1", 8000,))
        createEquipment.ports.add(Port(UUID.randomUUID(), "192.168.0.1", 9000,))
        equipmentRestService.updateEquipment(createEquipment)
        equipmentRestService.deleteEquipment(createEquipment.id!!)
    }
}