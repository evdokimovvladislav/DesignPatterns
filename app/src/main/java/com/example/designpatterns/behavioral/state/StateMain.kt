package com.example.designpatterns.behavioral.state

import com.example.designpatterns.behavioral.state.states.WorkState

/**
 * @author Evdokimov on 09.03.2022.
 *
 * Позволяет объекту менять поведение в зависимости от его состояния.
 */
fun main() {

    val worker = Worker(WorkState())

    repeat(30) {
        worker.doSomething()
    }
}