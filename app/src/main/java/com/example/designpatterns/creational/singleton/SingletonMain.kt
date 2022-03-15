package com.example.designpatterns.creational.singleton

/**
 * @author Evdokimov on 03.03.2022.
 *
 * Гарантирует создание одного экземпляра класса
 *
 * Объект обладает приватным конструктором и статическим методом, который создаст этот объект или
 * вернет уже существующий экземпляр, если он был проинициализирован ранее
 */

fun main() {
    val db1 = DataBaseJavaLike.getInstance()
    val db2 = DataBaseJavaLike.getInstance()

    println("Одинаковые ссылки")
    println("${db1 == db2}")
}