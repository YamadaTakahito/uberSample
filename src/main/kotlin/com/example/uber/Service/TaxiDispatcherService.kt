package com.example.uber.Service

import com.example.uber.Entity.Suppiler
import com.example.uber.Entity.Taxi
import org.springframework.stereotype.Service

@Service
class TaxiDispatcherService {
    fun orderTaxi(id: Int): Taxi {
        val taxi = Taxi(
                id = id,
                suppilerId = id,
                color = "red",
                price = 1000,
                size = 1
        )
        val supplier = Suppiler(
                id = taxi.suppilerId,
                name = "JP Taxi",
                taxis = listOf(taxi)
        )
        supplier.call()
        

        return taxi
    }
}