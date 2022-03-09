package com.example.designpatterns.behavioral.mediator

import com.example.designpatterns.behavioral.mediator.users.User

/**
 * @author Evdokimov on 09.03.2022.
 */
interface Chat {

    fun sendMessage(sender: User, message: String)
}