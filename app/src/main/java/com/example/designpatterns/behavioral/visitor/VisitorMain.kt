package com.example.designpatterns.behavioral.visitor

import com.example.designpatterns.behavioral.visitor.animals.Cat
import com.example.designpatterns.behavioral.visitor.animals.Dog
import com.example.designpatterns.behavioral.visitor.visitors.Child
import com.example.designpatterns.behavioral.visitor.visitors.Owner
import com.example.designpatterns.behavioral.visitor.visitors.Visitor

/**
 * @author Evdokimov on 09.03.2022.
 *
 *
 */
fun main() {

    val cat = Cat()
    val dog = Dog()

    var visitor: Visitor = Owner()
    cat.accept(visitor)
    dog.accept(visitor)
    println()

    visitor = Child()
    cat.accept(visitor)
    dog.accept(visitor)
}