package com.example.designpatterns.behavioral.visitor.animals

import com.example.designpatterns.behavioral.visitor.visitors.Visitor

/**
 * @author Evdokimov on 09.03.2022.
 */
class Cat : Animals {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}