package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment

import com.wonzopein.hexagonal.application.port.input.CreateEquipmentUseCase
import com.wonzopein.hexagonal.application.port.input.DeleteEquipmentUseCase
import com.wonzopein.hexagonal.application.port.input.GetEquipmentUseCase
import com.wonzopein.hexagonal.application.port.input.UpdateEquipmentUseCase
import com.wonzopein.hexagonal.domain.equipment.model.Equipment
import org.springframework.stereotype.Service
import java.util.*

@Service
class EquipmentRestService(
    private val createEquipmentUseCase: CreateEquipmentUseCase,
    private val updateEquipmentUseCase: UpdateEquipmentUseCase,
    private val getEquipmentUseCase: GetEquipmentUseCase,
    private val deleteEquipmentUseCase: DeleteEquipmentUseCase
) {
    fun createEquipment(equipment: Equipment): Equipment {
        return createEquipmentUseCase.createEquipment(equipment)
    }

    fun updateEquipment(equipment: Equipment) {
        updateEquipmentUseCase.updateEquipment(equipment)
    }

    fun getEquipment(id: UUID): Equipment {
        return getEquipmentUseCase.getEquipmentById(id)
    }

    fun deleteEquipment(id: UUID) {
        deleteEquipmentUseCase.deleteEquipmentById(id)
    }
}