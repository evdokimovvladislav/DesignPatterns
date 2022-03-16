package com.example.designpatterns.behavioral.command

/**
 * @author Evdokimov on 09.03.2022.
 *
 * Представление запроса в виде отдельного объекта.
 */
fun main() {
    val editor = Editor()
    val history = CommandHistory()
    val app = App(editor, history)

    app.copyButton.onPress()
    println("Актуальный текст в редакторе: ${editor.text}\n")
    app.pasteButton.onPress()
    println("Актуальный текст в редакторе: ${editor.text}\n")
    app.undoButton.onPress()
    println("Актуальный текст в редакторе: ${editor.text}")
}