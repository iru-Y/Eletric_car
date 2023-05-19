package com.example.eletricCar.presentation.data

import com.example.eletricCar.presentation.models.Car

object CarFactory {
    val list = listOf(
       Car(
           id = 1,
           price= "R$ 300.000",
           batter = "300 kWh",
           potency = "200cv",
           recharge= "30 min",
           urlPhoto = "google.com.br"
       )
    )
}