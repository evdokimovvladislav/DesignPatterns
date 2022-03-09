package com.example.designpatterns.behavioral.memento

/**
 * @author Evdokimov on 09.03.2022.
 */
class Game {

    private var level: String = ""
    private var hp: Int = 0

    fun setLevelAndHp(level: String, hp: Int) {
        this.level = level
        this.hp = hp
    }

    fun info() {
        println("Уровень: $level, здоровье: $hp")
    }

    fun save() = Save(level, hp)

    fun load(save: Save) {
        level = save.level
        hp = save.hp
    }
}