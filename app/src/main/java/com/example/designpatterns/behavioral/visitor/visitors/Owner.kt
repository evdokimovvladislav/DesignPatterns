package com.example.designpatterns.behavioral.visitor.visitors

import com.example.designpatterns.behavioral.visitor.animals.Cat
import com.example.designpatterns.behavioral.visitor.animals.Dog

/**
 * @author Evdokimov on 09.03.2022.
 */
class Owner : Visitor {

    override fun visit(cat: Cat) {
        println("Покормить кота")
    }

    override fun visit(dog: Dog) {
        println("Покормить собаку")
    }
}