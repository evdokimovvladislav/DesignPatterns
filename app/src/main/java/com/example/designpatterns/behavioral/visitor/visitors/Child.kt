package com.example.designpatterns.behavioral.visitor.visitors

import com.example.designpatterns.behavioral.visitor.animals.Cat
import com.example.designpatterns.behavioral.visitor.animals.Dog

/**
 * @author Evdokimov on 09.03.2022.
 */
class Child : Visitor {

    override fun visit(cat: Cat) {
        println("Поиграть с котом")
    }

    override fun visit(dog: Dog) {
        println("Поиграть с собакой")
    }
}