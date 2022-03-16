package com.example.designpatterns.behavioral.command

class Editor {

    var text = "Текст, который был в редакторе"

    fun getSelection(): String {
        println("Скопировали выделенный текст")
        return "Какой-то выбранный текст"
    }

    fun replaceSelection(text: String) {
        println("Замена выбранного текста на \"$text\"")
        this.text = text
    }
}