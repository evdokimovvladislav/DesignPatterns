package com.example.designpatterns.behavioral.command

import com.example.designpatterns.behavioral.command.commands.Command
import com.example.designpatterns.behavioral.command.commands.RestartCommand
import com.example.designpatterns.behavioral.command.commands.StartCommand
import com.example.designpatterns.behavioral.command.commands.StopCommand

/**
 * @author Evdokimov on 09.03.2022.
 *
 * Представление запроса в виде отдельного объекта.
 */
fun main() {

    val computer = Computer()

    val start: Command = StartCommand(computer)
    val stop: Command = StopCommand(computer)
    val restart: Command = RestartCommand(computer)

    val user = User(start, stop, restart)

    user.startComputer()
    user.stopComputer()
    user.restartComputer()
}