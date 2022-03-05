package com.example.designpatterns.creational.factoryMethod.factories

import com.example.designpatterns.creational.factoryMethod.cars.Zhiguli

/**
 * @author Evdokimov on 04.03.2022.
 */
class ZhiguliFactory : CarFactory {

    override fun createCar() = Zhiguli()
}