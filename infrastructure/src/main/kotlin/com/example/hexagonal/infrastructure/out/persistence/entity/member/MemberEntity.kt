package com.example.hexagonal.infrastructure.out.persistence.entity.member

import com.example.hexagonal.infrastructure.out.persistence.entity.BaseTimeEntity
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class MemberEntity: BaseTimeEntity() {

//    @Id
//    @GeneratedValue
//    @UuidGenerator
//    var uuid: UUID? = null
    @Id
    var id: String? = null
    var name: String? = null
}