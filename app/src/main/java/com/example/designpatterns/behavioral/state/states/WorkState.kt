package com.example.designpatterns.behavioral.state.states

import com.example.designpatterns.behavioral.state.Worker

/**
 * @author Evdokimov on 09.03.2022.
 */
class WorkState : State {

    private var days = 0

    override fun doSomething(context: Worker) {
        if (days < 5) {
            println("Работаем")
            days++
        } else
            context.setState(RecreationState())
    }
}