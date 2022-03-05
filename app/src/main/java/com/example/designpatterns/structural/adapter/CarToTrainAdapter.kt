package com.example.designpatterns.structural.adapter

/**
 * @author Evdokimov on 04.03.2022.
 *
 * Так же возможен вариант через наследование, но он не всегда доступен
 */
class CarToTrainAdapter(private val car: Car) : Train {

    override fun rideOnRails() {
        car.ride()
    }
}