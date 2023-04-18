package com.wonzopein.hexagonal.application.port.input

import java.util.UUID

interface DeleteEquipmentUseCase {
    fun deleteEquipmentById(id: UUID)
}