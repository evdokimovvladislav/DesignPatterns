package com.example.designpatterns.behavioral.observer

/**
 * @author Evdokimov on 05.03.2022.
 */
class Runner : Person {

    override fun getDressed(temp: Int) {
        println("Оделся по температуре $temp")
    }
}