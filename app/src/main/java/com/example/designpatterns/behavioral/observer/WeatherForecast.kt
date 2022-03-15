package com.example.designpatterns.behavioral.observer

/**
 * @author Evdokimov on 05.03.2022.
 */
class WeatherForecast {

    private val subscribers = mutableSetOf<Person>()

    fun subscribe(person: Person) {
        subscribers.add(person)
    }

    fun unsubscribe(person: Person) {
        subscribers.remove(person)
    }

    fun updateWhether(temp: Int) {
        subscribers.forEach {
            it.getDressed(temp)
        }
    }
}