package com.example.designpatterns.behavioral.command.commands

import com.example.designpatterns.behavioral.command.App
import com.example.designpatterns.behavioral.command.Editor

/**
 * @author Evdokimov on 09.03.2022.
 */
abstract class Command(
        protected val app: App,
        protected val editor: Editor
) {
    var backup = ""

    abstract fun execute(): Boolean

    fun saveBackup() {
        backup = editor.text
    }

    fun undo() {
        editor.text = backup
    }
}