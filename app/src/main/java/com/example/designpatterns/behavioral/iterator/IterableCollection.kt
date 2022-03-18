package com.example.designpatterns.behavioral.iterator

/**
 * @author Evdokimov on 09.03.2022.
 */
interface IterableCollection {

    fun createIterator(): Iterator
}