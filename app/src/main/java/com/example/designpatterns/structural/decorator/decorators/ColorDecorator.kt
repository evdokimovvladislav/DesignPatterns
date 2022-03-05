package com.example.designpatterns.structural.decorator.decorators

import com.example.designpatterns.structural.decorator.shapes.Shape

/**
 * @author Evdokimov on 04.03.2022.
 */
class ColorDecorator(shape: Shape) : Decorator(shape) {

    override fun draw() {
        super.draw()
        println("Закрашен каким-то цветом")
    }
}