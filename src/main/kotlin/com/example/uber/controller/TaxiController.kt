package com.example.uber.controller

import com.example.uber.Entity.Taxi
import com.example.uber.Service.TaxiDispatcherService
import com.example.uber.Service.TaxiFinderService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class TaxiController(
        private val taxiFinderService: TaxiFinderService,
        private val taxiDispatcherService: TaxiDispatcherService
){
    @GetMapping("/find")
    fun find(): List<Taxi>{
        val candidateTaxis = taxiFinderService.searchTaxis("color:red, price:cheep")
        return candidateTaxis
    }

    @GetMapping("/order")
    fun order(@RequestParam(name="taxi_id") taxiId: Int): ResponseEntity<HttpStatus>{
        taxiDispatcherService.orderTaxi(taxiId)
        return ResponseEntity(HttpStatus.OK)
    }
}