package com.wonzopein.hexagonal.infrastructure.adapter.`in`.rest.equipment

import com.wonzopein.hexagonal.application.port.`in`.CreateEquipmentUseCase
import com.wonzopein.hexagonal.application.port.`in`.GetEquipmentUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/equipment")
class EquipmentRestAdapter(
) {
    @PostMapping
    fun createEquipment() {

    }
}