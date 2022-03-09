package com.example.designpatterns.behavioral.templateMethod

/**
 * @author Evdokimov on 09.03.2022.
 *
 * Определяет скелет алгоритма, некоторые шаги которого определяются дочерними классами.
 */
fun main() {

    var game: TableGame = Chess()
    game.prepareGame()

    game = Jumanji()
    game.prepareGame()
}