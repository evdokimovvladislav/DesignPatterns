package com.example.designpatterns.behavioral.memento

/**
 * @author Evdokimov on 09.03.2022.
 *
 * Позволяет сохранять и восстанавливат состояние класса.
 */
fun main() {

    val game = Game()
    game.setLevelAndHp("LVL 1", 100)
    game.info()

    val file = File()
    file.save = game.save()

    game.setLevelAndHp("LVL 2", 50)
    game.info()

    file.save?.let {
        game.load(it)
    }
    game.info()
}