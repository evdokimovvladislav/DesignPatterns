package com.example.designpatterns.behavioral.command

import com.example.designpatterns.behavioral.command.commands.Command

/**
 * @author Evdokimov on 09.03.2022.
 */
class User(
    private val start: Command,
    private val stop: Command,
    private val restart: Command
) {
    fun startComputer() {
        start.execute()
    }

    fun stopComputer() {
        stop.execute()
    }

    fun restartComputer() {
        restart.execute()
    }
}