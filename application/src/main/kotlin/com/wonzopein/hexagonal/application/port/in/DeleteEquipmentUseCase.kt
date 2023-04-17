package com.wonzopein.hexagonal.application.port.`in`

import java.util.UUID

interface DeleteEquipmentUseCase {
    fun deleteEquipmentById(id: UUID)
}