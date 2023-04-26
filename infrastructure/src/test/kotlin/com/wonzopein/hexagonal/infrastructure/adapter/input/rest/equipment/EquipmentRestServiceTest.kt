package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment

import com.fasterxml.jackson.databind.ObjectMapper
import com.wonzopein.hexagonal.domain.equipment.model.EquipmentType
import com.wonzopein.hexagonal.infrastructure.adapter.configuration.logger
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.request.EquipmentCreateRequest
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.mapper.EquipmentRestMapper
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class EquipmentRestServiceTest(
    @Autowired val objectMapper: ObjectMapper,
    @Autowired val equipmentRestService: EquipmentRestService,
    @Autowired val equipmentRestMapper: EquipmentRestMapper
) {

    var log = logger()

    @Test
    fun createEquipment() {
        val createRequest = equipmentRestMapper.toEquipment(EquipmentCreateRequest(null,"Test Equipment1", "", EquipmentType.UNKNOWN))
        val createResponse = equipmentRestService.createEquipment(createRequest)
        assertNotNull(createResponse)
        log.debug("createResponse=${objectMapper.writeValueAsString(createResponse)}")
    }

    @Test
    fun updateEquipment() {
    }

    @Test
    fun getEquipment() {
        val createRequest = equipmentRestMapper.toEquipment(EquipmentCreateRequest(null,"Test Equipment2", "", EquipmentType.UNKNOWN))
        val createResponse = equipmentRestService.createEquipment(createRequest)

        val equipment= equipmentRestService.getEquipment(createResponse.id!!)
        assertNotNull(equipment)
        log.debug("equipment=${objectMapper.writeValueAsString(equipment)}")

    }

    @Test
    fun deleteEquipment() {
    }
}