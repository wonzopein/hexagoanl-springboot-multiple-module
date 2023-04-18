package com.wonzopein.hexagonal.infrastructure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
class Infrastructure

fun main(args: Array<String>) {
    runApplication<Infrastructure>(*args)
}
