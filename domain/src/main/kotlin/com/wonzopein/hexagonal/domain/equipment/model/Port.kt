package com.wonzopein.hexagonal.domain.equipment.model

import java.util.UUID

class Port(
    val id: UUID
) {
    var host: String = ""
    var port: Int = 0
    var description: String = ""

    override fun equals(other: Any?): Boolean {
        return other is Port && other.id == id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}