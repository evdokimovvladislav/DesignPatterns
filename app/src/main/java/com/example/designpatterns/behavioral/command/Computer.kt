package com.example.designpatterns.behavioral.command

/**
 * @author Evdokimov on 09.03.2022.
 */
class Computer {

    fun start() {
        println("Включение компьютера")
    }

    fun stop() {
        println("Выключение компьютера")
    }

    fun restart() {
        println("Перезагрузка компьютера")
    }
}