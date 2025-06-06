package com.example.donutsapp.ui.home_screen

import androidx.compose.ui.graphics.Color
import com.example.donutsapp.R

data class Offer (
    val boxColor: Color,
    val donutImage: Int,
    val donutName: String,
    val donutDescription: String,
    val donutOldPrice: String,
    val donutNewPrice: String,
)

val donutOffers = listOf(
    Offer(
        boxColor = Color(0xFFD7E4F6),
        donutImage = R.drawable.donut_offer1,
        donutName = "Strawberry Wheel",
        donutDescription = "These Baked Strawberry Donuts are filled with fresh strawberries...",
        donutOldPrice = "$20",
        donutNewPrice = "$16",
    ),
    Offer(
        boxColor = Color(0xFFFFC7D0),
        donutImage = R.drawable.donut_offer2,
        donutName = "Chocolate Glaze",
        donutDescription = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
        donutOldPrice = "$20",
        donutNewPrice = "$16"
    )
)