package com.example.designpatterns.behavioral.command.commands

import com.example.designpatterns.behavioral.command.App
import com.example.designpatterns.behavioral.command.Editor

class UndoCommand(app: App, editor: Editor) : Command(app, editor) {

    override fun execute(): Boolean {
        app.undo()
        return false
    }
}