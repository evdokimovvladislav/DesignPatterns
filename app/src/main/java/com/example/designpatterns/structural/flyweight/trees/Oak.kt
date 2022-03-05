package com.example.designpatterns.structural.flyweight.trees

/**
 * @author Evdokimov on 05.03.2022.
 */
class Oak : Tree {

    private val height = 8

    override fun plant(x: Int, y: Int) {
        println("Посадить дуб высотой $height м по координатам: $x , $y")
    }
}