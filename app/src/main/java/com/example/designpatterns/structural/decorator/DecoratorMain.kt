package com.example.designpatterns.structural.decorator

import com.example.designpatterns.structural.decorator.decorators.ColorDecorator
import com.example.designpatterns.structural.decorator.shapes.Circle
import com.example.designpatterns.structural.decorator.shapes.Shape

/**
 * @author Evdokimov on 04.03.2022.
 *
 * Позволяет добавлять объектам новую функциональность, не изменяя родительский объект.
 */
fun main(){

    var circle: Shape = Circle()
    circle.draw()
    println()

    circle = ColorDecorator(circle)
    circle.draw()
}