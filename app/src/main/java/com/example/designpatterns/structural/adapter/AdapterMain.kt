package com.example.designpatterns.structural.adapter

/**
 * @author Evdokimov on 04.03.2022.
 *
 * Позволяет совместить несовместимые интерфейсы.
 */
fun main() {

    val train: Train = CarToTrainAdapter(Car())

    println("Теперь машина едет по рельсам")
    train.rideOnRails()
}