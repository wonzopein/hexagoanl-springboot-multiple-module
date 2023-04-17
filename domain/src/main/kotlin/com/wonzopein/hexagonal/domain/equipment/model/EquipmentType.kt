package com.wonzopein.hexagonal.domain.equipment.model

import com.fasterxml.jackson.annotation.JsonCreator


//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
enum class EquipmentType(var value: Int, var description: String) {
    UNKNOWN(0, "알수없음"),
    AUTO(10, "자동"),
    AUTO_SEMI(11, "반-자동"),
    MANUAL(20, "수동")
    ;
    companion object {
        @JvmStatic
        @JsonCreator
        fun of(value: Int): EquipmentType {
            return values().first { (it.value == value) }
        }
    }
}