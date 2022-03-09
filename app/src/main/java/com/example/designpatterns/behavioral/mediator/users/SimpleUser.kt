package com.example.designpatterns.behavioral.mediator.users

import com.example.designpatterns.behavioral.mediator.Chat

/**
 * @author Evdokimov on 09.03.2022.
 */
class SimpleUser(chat: Chat) : User(chat) {

    override fun getMessage(message: String) {
        println("Обычный пользователь получает сообщение: $message")
    }
}