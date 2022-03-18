package com.example.designpatterns.behavioral.chainOfResponsibility.notifiers

/**
 * @author Evdokimov on 05.03.2022.
 */
class EmailNotifier(priority: Int) : Notifier(priority) {

    override fun write(message: String) {
        println("Отправил письмо на почту: $message")
    }
}