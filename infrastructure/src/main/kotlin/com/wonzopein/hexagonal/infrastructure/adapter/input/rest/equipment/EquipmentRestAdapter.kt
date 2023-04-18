package com.wonzopein.hexagonal.infrastructure.adapter.input.rest.equipment

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/equipment")
class EquipmentRestAdapter(
) {
    @PostMapping
    fun createEquipment() {

    }
}