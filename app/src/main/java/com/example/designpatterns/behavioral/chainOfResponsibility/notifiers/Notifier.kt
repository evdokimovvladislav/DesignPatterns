package com.example.designpatterns.behavioral.chainOfResponsibility.notifiers

/**
 * @author Evdokimov on 05.03.2022.
 */
abstract class Notifier(private val priority: Int) {

    private var nextNotifier: Notifier? = null

    fun addNextNotifier(notifier: Notifier) {
        this.nextNotifier = notifier
    }

    fun notify(message: String, level: Int) {

        if (level >= priority) write(message)
        nextNotifier?.notify(message, level)
    }

    abstract fun write(message: String)
}