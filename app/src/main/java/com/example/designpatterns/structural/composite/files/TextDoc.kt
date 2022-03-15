package com.example.designpatterns.structural.composite.files

/**
 * @author Evdokimov on 04.03.2022.
 */
class TextDoc: File{

    override fun showType() {
        println("Текстовый документ")
    }

    override fun toString(): String = "TextDoc"
}