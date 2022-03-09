package com.example.designpatterns.behavioral.visitor.visitors

import com.example.designpatterns.behavioral.visitor.animals.Cat
import com.example.designpatterns.behavioral.visitor.animals.Dog

/**
 * @author Evdokimov on 09.03.2022.
 */
interface Visitor {

    fun visit(cat: Cat)
    fun visit(dog: Dog)
}