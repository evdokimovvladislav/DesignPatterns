package com.example.designpatterns.creational.abstactFactory.systems.mac

import com.example.designpatterns.creational.abstactFactory.elements.TextView

/**
 * @author Evdokimov on 04.03.2022.
 */
class MacTextView : TextView {

    override fun paint() {
        println("Отрисовать кнопку в стиле Windows")
    }
}