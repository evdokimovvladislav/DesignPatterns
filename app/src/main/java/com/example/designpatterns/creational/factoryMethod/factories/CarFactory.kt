package com.example.designpatterns.creational.factoryMethod.factories

import com.example.designpatterns.creational.factoryMethod.cars.Car

/**
 * @author Evdokimov on 04.03.2022.
 */
interface CarFactory {

    fun createCar(): Car
}
