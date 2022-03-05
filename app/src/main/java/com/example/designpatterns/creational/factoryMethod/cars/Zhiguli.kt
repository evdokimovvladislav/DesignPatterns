package com.example.designpatterns.creational.factoryMethod.cars

/**
 * @author Evdokimov on 04.03.2022.
 */
class Zhiguli : Car() {

    override fun ride() {
        println("Едет медленно")
    }

    override fun stop() {
        println("Останавливается медленно")
    }
}