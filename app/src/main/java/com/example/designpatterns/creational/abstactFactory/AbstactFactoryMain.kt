package com.example.designpatterns.creational.abstactFactory

import com.example.designpatterns.creational.abstactFactory.elements.Button
import com.example.designpatterns.creational.abstactFactory.elements.TextView
import com.example.designpatterns.creational.abstactFactory.systems.mac.MacFactory
import com.example.designpatterns.creational.abstactFactory.systems.windows.WindowsFactory

/**
 * @author Evdokimov on 03.03.2022.
 *
 * Паттер для создания семеств объектов, не привязываясь к самим классам этих объектов
 */
fun main() {
    val os = checkOS()

    val factory: UIFactory = if (os == "windows") WindowsFactory() else MacFactory()

    val button: Button = factory.createButton()
    val textView: TextView = factory.createTextView()

    println("${button.paint()}\n${textView.paint()}")
}

/**
 * Фейковая проверка OS
 */
private fun checkOS() = "windows"