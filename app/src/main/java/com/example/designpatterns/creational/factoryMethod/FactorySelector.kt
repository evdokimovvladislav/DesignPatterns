package com.example.designpatterns.creational.factoryMethod

import com.example.designpatterns.creational.factoryMethod.factories.CarFactory
import com.example.designpatterns.creational.factoryMethod.factories.PorscheFactory
import com.example.designpatterns.creational.factoryMethod.factories.ToyotaFactory
import com.example.designpatterns.creational.factoryMethod.factories.ZhiguliFactory

/**
 * @author Evdokimov on 04.03.2022.
 */
object FactorySelector {

    fun getFactory(type: CoatTypes): CarFactory =
        when (type) {
            CoatTypes.EXPENSIVE -> PorscheFactory()
            CoatTypes.MEDIUM_COAT -> ToyotaFactory()
            CoatTypes.CHEEP -> ZhiguliFactory()
        }
}