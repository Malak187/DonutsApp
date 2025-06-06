package com.example.donutsapp.ui.home_screen

import com.example.donutsapp.R

data class Donut(
    val donutImage: Int,
    val donutName: String,
    val donutPrice: String,
)

val donuts = listOf(
    Donut(
        donutImage = R.drawable.donut1,
        donutName = "Chocolate Cherry",
        donutPrice = "$22"
    ),
    Donut(
        donutImage = R.drawable.donut2,
        donutName = "Strawberry Rain",
        donutPrice = "$22"
    ),
    Donut(
        donutImage = R.drawable.donut3,
        donutName = "Strawberry Coco",
        donutPrice = "$22"
    ),
)