package com.example.designpatterns.behavioral.command

import com.example.designpatterns.behavioral.command.commands.Command
import com.example.designpatterns.behavioral.command.commands.CopyCommand
import com.example.designpatterns.behavioral.command.commands.PasteCommand
import com.example.designpatterns.behavioral.command.commands.UndoCommand
import com.example.designpatterns.behavioral.command.ui.CopyButton
import com.example.designpatterns.behavioral.command.ui.PasteButton
import com.example.designpatterns.behavioral.command.ui.UndoButton

class App(
    editor: Editor,
    private val history: CommandHistory
) {
    var clipboard: String = ""

    val copyButton = CopyButton(this, CopyCommand(this, editor))
    val pasteButton = PasteButton(this, PasteCommand(this, editor))
    val undoButton = UndoButton(this, UndoCommand(this, editor))

    fun executeCommand(command: Command) {
        if (command.execute())
            history.push(command)
    }

    fun undo() {
        history.pop().undo()
        println("Отменили последнее действие")
    }
}