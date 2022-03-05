package com.example.designpatterns.behavioral.observer

/**
 * @author Evdokimov on 05.03.2022.
 *
 * Позволяет объектам-наблюдателям "подписываться" на какие-либо изменения объкта-издателя
 * и реагировать на них.
 */
fun main(){

    val weatherForecast = WeatherForecast()

    val human1 = Runner()
    val human2 = Runner()
    val human3 = Runner()
    val human4 = Runner()
    val human5 = Runner()

    weatherForecast.subscribe(human1)
    weatherForecast.subscribe(human2)
    weatherForecast.subscribe(human3)
    weatherForecast.subscribe(human4)
    weatherForecast.subscribe(human5)

    var degrees = (-40..40).random()
    weatherForecast.updateWhether(degrees)

    println("Кто-то решил отписаться")
    weatherForecast.unsubscribe(human1)
    weatherForecast.unsubscribe(human2)
    weatherForecast.unsubscribe(human3)

    degrees = (-40..40).random()
    weatherForecast.updateWhether(degrees)
}