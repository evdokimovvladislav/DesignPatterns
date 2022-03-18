package com.example.designpatterns.structural.decorator

import com.example.designpatterns.structural.decorator.decorators.ColorDecorator
import com.example.designpatterns.structural.decorator.shapes.Circle
import com.example.designpatterns.structural.decorator.shapes.Shape

/**
 * @author Evdokimov on 04.03.2022.
 *
 * Позволяет добавлять объектам новую функциональность, не изменяя родительский объект.
 */
fun main() {

    val circle1: Shape = Circle()
    circle1.draw()
    println()

    val circle2 = ColorDecorator(circle1)
    circle2.draw()
    circle2.floodFill()
}