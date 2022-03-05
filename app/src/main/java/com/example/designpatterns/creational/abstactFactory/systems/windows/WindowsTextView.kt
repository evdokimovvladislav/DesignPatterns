package com.example.designpatterns.creational.abstactFactory.systems.windows

import com.example.designpatterns.creational.abstactFactory.elements.TextView

/**
 * @author Evdokimov on 04.03.2022.
 */
class WindowsTextView : TextView {

    override fun paint() {
        println("Отрисовать текст в стиле Windows")
    }
}