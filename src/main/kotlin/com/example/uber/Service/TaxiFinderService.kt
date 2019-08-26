package com.example.uber.Service

import com.example.uber.Entity.Suppiler
import com.example.uber.Entity.Taxi
import org.springframework.stereotype.Service

@Service
class TaxiFinderService {
    fun searchTaxis(condition: String): List<Taxi>{
        val suppilers = listOf<Suppiler>()
        return suppilers.flatMap { it.taxis }
    }
}