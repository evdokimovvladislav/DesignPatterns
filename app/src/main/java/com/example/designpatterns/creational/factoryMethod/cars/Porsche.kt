package com.example.designpatterns.creational.factoryMethod.cars

/**
 * @author Evdokimov on 04.03.2022.
 */
class Porsche : Car() {

    override fun ride() {
        println("Едет быстро")
    }

    override fun stop() {
        println("Останавливается быстро")
    }
}