package com.example.designpatterns.creational.factoryMethod.factories

import com.example.designpatterns.creational.factoryMethod.cars.Toyota

/**
 * @author Evdokimov on 04.03.2022.
 */
class ToyotaFactory : CarFactory {

    override fun createCar() = Toyota()
}