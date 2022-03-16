package com.example.designpatterns.behavioral.command.commands

import com.example.designpatterns.behavioral.command.Computer

/**
 * @author Evdokimov on 09.03.2022.
 */
class StopCommand(private val comp: Computer) : Command {

    override fun execute() {
        comp.stop()
    }
}