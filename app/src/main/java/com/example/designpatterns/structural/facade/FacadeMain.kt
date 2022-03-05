package com.example.designpatterns.structural.facade

/**
 * @author Evdokimov on 04.03.2022.
 *
 * Позволяет изолировать клиента от сложной подсистемы.
 */
fun main() {
    val order = Order()
    order.makeOrder()
}