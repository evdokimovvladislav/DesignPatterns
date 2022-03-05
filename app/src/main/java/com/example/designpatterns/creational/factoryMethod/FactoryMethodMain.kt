package com.example.designpatterns.creational.factoryMethod

import com.example.designpatterns.creational.factoryMethod.cars.Car
import com.example.designpatterns.creational.factoryMethod.factories.CarFactory

/**
 * @author Evdokimov on 03.03.2022.
 *
 * Паттерн для создания объектов, не привязываясь к самим классам этих объектов
 */
fun main() {

    var factory: CarFactory = FactorySelector.getFactory(CoatTypes.EXPENSIVE)
    var car: Car = factory.createCar()

    println(car.ride())
    println(car.stop())

    factory = FactorySelector.getFactory(CoatTypes.CHEEP)
    car = factory.createCar()

    println(car.ride())
    println(car.stop())
}