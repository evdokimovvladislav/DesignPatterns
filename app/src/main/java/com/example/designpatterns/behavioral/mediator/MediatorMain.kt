package com.example.designpatterns.behavioral.mediator

import com.example.designpatterns.behavioral.mediator.users.Admin
import com.example.designpatterns.behavioral.mediator.users.SimpleUser

/**
 * @author Evdokimov on 09.03.2022.
 *
 * Уменьшает связность классов, помещая свзяи в класс-посредник.
 */
fun main() {

    val chat = TextChat()

    val admin = Admin(chat)

    val user1 = SimpleUser(chat)
    val user2 = SimpleUser(chat)
    val user3 = SimpleUser(chat)

    chat.admin = admin
    chat.addUser(user1)
    chat.addUser(user2)
    chat.addUser(user3)

    admin.sendMessage("Я админ")
    println()
    user1.sendMessage("Я пользователь 1")
}