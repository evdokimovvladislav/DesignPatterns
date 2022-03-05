package com.example.designpatterns.structural.bridge

import com.example.designpatterns.structural.bridge.colors.Red
import com.example.designpatterns.structural.bridge.colors.Yellow
import com.example.designpatterns.structural.bridge.shapes.Rectangle
import com.example.designpatterns.structural.bridge.shapes.Square

/**
 * @author Evdokimov on 04.03.2022.
 *
 * Позвоволяет разделить класс(ы) на разные иерархии, которые возвозжно редактировать
 * независимо друг от друга.
 */
fun main() {

    val square = Square(Red())
    val rectangle = Rectangle(Yellow())

    square.draw()
    println()
    rectangle.draw()
}