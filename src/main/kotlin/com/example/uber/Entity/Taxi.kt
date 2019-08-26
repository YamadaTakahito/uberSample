package com.example.uber.Entity

data class Taxi(
        val id: Int,
        val suppilerId: Int,
        val size: Int,
        val color: String,
        val price: Int
)