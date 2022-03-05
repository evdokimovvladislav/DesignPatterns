package com.example.designpatterns.creational.factoryMethod.cars

/**
 * @author Evdokimov on 04.03.2022.
 */
class Toyota : Car() {

    override fun ride() {
        println("Едет со средней скоростью")
    }

    override fun stop() {
        println("Останавливается со средней скоростью")
    }
}