package com.example.designpatterns.behavioral.command.commands

import com.example.designpatterns.behavioral.command.App
import com.example.designpatterns.behavioral.command.Editor

class PasteCommand(app: App, editor: Editor) : Command(app, editor) {

    override fun execute(): Boolean {
        saveBackup()
        editor.replaceSelection(app.clipboard)
        return true
    }
}