package com.example.uber

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UberApplication

fun main(args: Array<String>) {
	runApplication<UberApplication>(*args)
}
