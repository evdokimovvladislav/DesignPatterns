package com.example.designpatterns.behavioral.templateMethod

/**
 * @author Evdokimov on 09.03.2022.
 */
class Chess : TableGame() {

    override fun prepareField() {
        println("Разложили шахматную доску")
    }

    override fun arrangeFigures() {
        println("Расставили шахматные фигуры")
    }
}