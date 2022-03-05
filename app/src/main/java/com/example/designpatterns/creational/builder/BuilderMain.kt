package com.example.designpatterns.creational.builder

/**
 * @author Evdokimov on 03.03.2022.
 *
 * Паттерн для пошагового создания сложных объектов при помощи цепочки методов.
 *
 * Не понимаю зачем нужен в Kotlin при наличии дефолтных значений в конструкторе.
 */

fun main() {
    val house = HouseBuilder()
        .buildWalls("Some walls producer")
        .buildDoor("Some doors producer")
        .buildWindow("Some window producer")
        .build()

    println(house)
}