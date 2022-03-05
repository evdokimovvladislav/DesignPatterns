package com.example.designpatterns.structural.bridge.shapes

import com.example.designpatterns.structural.bridge.colors.Color

/**
 * @author Evdokimov on 04.03.2022.
 */
class Square(color: Color) : Shape(color) {

    override fun draw() {
        println("Квадрат нарисован")
        color.paint()
    }
}