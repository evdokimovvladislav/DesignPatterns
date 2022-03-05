package com.example.designpatterns.behavioral.strategy.strategies

/**
 * @author Evdokimov on 05.03.2022.
 */
class WorkWithGoogleCloud : SaveStrategy {

    override fun save(data: String) {
        println("Сохранили в Google облако")
    }
}