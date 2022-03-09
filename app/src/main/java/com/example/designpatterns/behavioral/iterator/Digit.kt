package com.example.designpatterns.behavioral.iterator

/**
 * @author Evdokimov on 09.03.2022.
 */
class Digit : IterableCollection {

    private val digits = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    override fun createIterator(): Iterator = DigitIterator()

    private inner class DigitIterator : Iterator {

        private var index = 0

        override fun hasMore(): Boolean = index < digits.size

        override fun getNext(): Int = digits[index++]
    }
}