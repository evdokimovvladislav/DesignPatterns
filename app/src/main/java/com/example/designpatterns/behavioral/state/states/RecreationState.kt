package com.example.designpatterns.behavioral.state.states

import com.example.designpatterns.behavioral.state.Worker

/**
 * @author Evdokimov on 09.03.2022.
 */
class RecreationState : State {

    private var days = 0

    override fun doSomething(context: Worker) {
        if (days < 2) {
            println("Отдыхаем")
            days++
        } else
            context.setState(WorkState())
    }
}