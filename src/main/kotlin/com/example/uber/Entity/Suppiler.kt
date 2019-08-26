package com.example.uber.Entity

data class Suppiler(
        val id: Int,
        val name: String,
        val taxis: List<Taxi>
){
    fun call(): String {
        return "call taxi"
    }
}