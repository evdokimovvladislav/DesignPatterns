package com.example.designpatterns.behavioral.state

import com.example.designpatterns.behavioral.state.states.State

/**
 * @author Evdokimov on 09.03.2022.
 */
class Worker(private var state: State) {

    fun setState(state: State) {
        this.state = state
    }

    fun doSomething() {
        state.doSomething(this)
    }
}