package com.example.designpatterns.behavioral.templateMethod

/**
 * @author Evdokimov on 09.03.2022.
 */
abstract class TableGame {

    protected abstract fun prepareField()

    protected abstract fun arrangeFigures()

    fun prepareGame() {
        prepareField()
        arrangeFigures()
    }
}