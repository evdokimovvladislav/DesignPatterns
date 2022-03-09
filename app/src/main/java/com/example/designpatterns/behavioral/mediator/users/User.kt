package com.example.designpatterns.behavioral.mediator.users

import com.example.designpatterns.behavioral.mediator.Chat

/**
 * @author Evdokimov on 09.03.2022.
 */
abstract class User(private val chat: Chat) {

    abstract fun getMessage(message: String)

    fun sendMessage(message: String) {
        chat.sendMessage(this, message)
    }
}