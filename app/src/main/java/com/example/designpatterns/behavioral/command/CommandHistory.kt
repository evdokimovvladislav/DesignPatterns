package com.example.designpatterns.behavioral.command

import com.example.designpatterns.behavioral.command.commands.Command

class CommandHistory {

    private val history = mutableListOf<Command>()

    fun push(command: Command) {
        history.add(command)
    }

    fun pop(): Command = history.last().apply { history.removeLast() }
}