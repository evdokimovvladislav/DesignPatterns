package com.example.designpatterns.behavioral.chainOfResponsibility

import com.example.designpatterns.behavioral.chainOfResponsibility.notifiers.EmailNotifier
import com.example.designpatterns.behavioral.chainOfResponsibility.notifiers.NotificationNotifier
import com.example.designpatterns.behavioral.chainOfResponsibility.notifiers.SMSNotifier

/**
 * @author Evdokimov on 05.03.2022.
 *
 * Позволяет передавать запросы по цепочке обработчиков.
 */
fun main() {

    val notificationNotifier = NotificationNotifier(Priority.LOW)
    val emailNotifier = EmailNotifier(Priority.MEDIUM)
    val smsNotifier = SMSNotifier(Priority.HIGH)

    notificationNotifier.addNextNotifier(emailNotifier)
    emailNotifier.addNextNotifier(smsNotifier)

    notificationNotifier.notify("Всё хорошо", Priority.LOW)
    println()
    notificationNotifier.notify("Происходит что-то странное", Priority.MEDIUM)
    println()
    notificationNotifier.notify("Дом горит", Priority.HIGH)
}