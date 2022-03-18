package com.example.designpatterns.structural.flyweight.trees

/**
 * @author Evdokimov on 05.03.2022.
 */
class Spruce : Tree {

    private val height = 3

    override fun plant(x: Int, y: Int) {
        println("Посадить ель высотой $height м по координатам: $x , $y")
    }
}