package com.example.designpatterns.behavioral.iterator

/**
 * @author Evdokimov on 09.03.2022.
 *
 * Позволяет пройтись по элементам составных объектов, создавая необходимый алгорит обхода.
 */
fun main() {

    val digits = Digit()
    val iterator: Iterator = digits.createIterator()

    while (iterator.hasMore()) {
        println(iterator.getNext())
    }
}
