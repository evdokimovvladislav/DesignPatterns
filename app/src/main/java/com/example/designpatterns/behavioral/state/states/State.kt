package com.example.designpatterns.behavioral.state.states

import com.example.designpatterns.behavioral.state.Worker

/**
 * @author Evdokimov on 09.03.2022.
 */
interface State {

    fun doSomething(context: Worker)
}