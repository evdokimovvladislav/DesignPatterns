package com.example.designpatterns.creational.protorype

/**
 * @author Evdokimov on 03.03.2022.
 *
 * Позволяет копировать объекты, не вдаваясь в подробности их реализации.
 */

fun main() {

    val originalCell = Cell("Blood cell", 5)
    val copyCell = originalCell.clone()

    println("Одинаковое содержание, но разные ссылки")
    println("${originalCell == copyCell}")
}