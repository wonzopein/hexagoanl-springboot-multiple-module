package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment

import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.request.EquipmentCreateRequest
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.response.EquipmentCreateResponse
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.data.response.EquipmentGetResponse
import com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment.mapper.EquipmentRestMapper
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/equipment")
class EquipmentRestAdapter(
    val equipmentRestService: EquipmentRestService,
    val equipmentRestMapper: EquipmentRestMapper
) {
    @PostMapping
    fun createEquipment(equipmentCreateRequest: EquipmentCreateRequest): ResponseEntity<EquipmentCreateResponse> {
        var equipment =  equipmentRestMapper.toEquipment(equipmentCreateRequest)
        equipment = equipmentRestService.createEquipment(equipment)
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(equipmentRestMapper.toEquipmentCreateResponse(equipment))
    }

    @PostMapping("/{id}")
    fun updateEquipment(@PathVariable("id") id: UUID) : ResponseEntity<EquipmentGetResponse> {
        val equipment = equipmentRestService.getEquipment(id)
        return ResponseEntity
            .ok(equipmentRestMapper.toEquipmentGetResponse(equipment))
    }
}