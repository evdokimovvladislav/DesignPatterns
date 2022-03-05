package com.example.designpatterns.behavioral.chainOfResponsibility.notifiers

/**
 * @author Evdokimov on 05.03.2022.
 */
class SMSNotifier(priority: Int) : Notifier(priority) {

    override fun write(message: String) {
        println("Отправил смс: $message")
    }
}