package com.example.designpatterns.structural.flyweight.trees

/**
 * @author Evdokimov on 05.03.2022.
 */
class Pine : Tree {

    private val height = 5

    override fun plant(x: Int, y: Int) {
        println("Посадить сосну высотой $height м по координатам: $x , $y")
    }
}