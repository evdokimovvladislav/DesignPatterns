package com.example.designpatterns.behavioral.mediator

import com.example.designpatterns.behavioral.mediator.users.Admin
import com.example.designpatterns.behavioral.mediator.users.SimpleUser
import com.example.designpatterns.behavioral.mediator.users.User

/**
 * @author Evdokimov on 09.03.2022.
 */
class TextChat : Chat {

    var admin: Admin? = null
    private val users = mutableListOf<SimpleUser>()

    override fun sendMessage(sender: User, message: String) {
        users.forEach { user ->
            if (user != sender) user.getMessage(message)
        }
        if (sender !is Admin) admin?.getMessage(message)
    }

    fun addUser(user: SimpleUser) {
        users.add(user)
    }
}