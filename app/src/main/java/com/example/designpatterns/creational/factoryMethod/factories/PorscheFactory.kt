package com.example.designpatterns.creational.factoryMethod.factories

import com.example.designpatterns.creational.factoryMethod.cars.Porsche

/**
 * @author Evdokimov on 04.03.2022.
 */
class PorscheFactory : CarFactory {

    override fun createCar() = Porsche()
}