package com.example.designpatterns.behavioral.chainOfResponsibility.notifiers

/**
 * @author Evdokimov on 05.03.2022.
 */
class NotificationNotifier(priority: Int) : Notifier(priority) {

    override fun write(message: String) {
        println("Отправил уведомление на телефон: $message")
    }
}