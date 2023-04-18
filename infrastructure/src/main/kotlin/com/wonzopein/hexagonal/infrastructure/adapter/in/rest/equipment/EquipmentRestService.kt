package com.wonzopein.hexagonal.infrastructure.adapter.`in`.rest.equipment

import com.wonzopein.hexagonal.application.port.`in`.CreateEquipmentUseCase
import org.springframework.stereotype.Service

@Service
class EquipmentRestService(
    private val createEquipmentUseCase: CreateEquipmentUseCase
) {
}