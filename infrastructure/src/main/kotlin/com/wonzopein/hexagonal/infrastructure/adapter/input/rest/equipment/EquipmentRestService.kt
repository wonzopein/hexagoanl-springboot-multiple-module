package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment

import com.wonzopein.hexagonal.application.port.input.CreateEquipmentUseCase
import org.springframework.stereotype.Service

@Service
class EquipmentRestService(
    private val createEquipmentUseCase: CreateEquipmentUseCase
) {
}