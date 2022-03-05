package com.example.designpatterns.structural.bridge.shapes

import com.example.designpatterns.structural.bridge.colors.Color

/**
 * @author Evdokimov on 04.03.2022.
 */
abstract class Shape(protected val color: Color) {

    abstract fun draw()
}