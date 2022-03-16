package com.example.designpatterns.behavioral.command.ui

import com.example.designpatterns.behavioral.command.App
import com.example.designpatterns.behavioral.command.commands.Command

abstract class Button(
    private val app: App,
    private val command: Command
) {
    fun onPress() {
        app.executeCommand(command)
    }
}