package com.example.designpatterns.creational.abstactFactory.systems.mac

import com.example.designpatterns.creational.abstactFactory.elements.Button

/**
 * @author Evdokimov on 04.03.2022.
 */
class MacButton : Button {

    override fun paint() {
        println("Отрисовать кнопку в стиле MacOS")
    }
}