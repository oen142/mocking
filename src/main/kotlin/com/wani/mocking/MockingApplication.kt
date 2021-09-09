package com.wani.mocking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MockingApplication

fun main(args: Array<String>) {
    runApplication<MockingApplication>(*args)
}
