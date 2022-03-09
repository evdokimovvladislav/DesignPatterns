package com.example.designpatterns.behavioral.templateMethod

/**
 * @author Evdokimov on 09.03.2022.
 */
class Jumanji : TableGame() {

    override fun prepareField() {
        println("Откопали и разложили доску")
    }

    override fun arrangeFigures() {
        println("Поставили фигурки на первую клетку")
    }
}