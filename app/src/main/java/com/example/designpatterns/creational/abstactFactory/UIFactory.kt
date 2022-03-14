package com.example.designpatterns.creational.abstactFactory

import com.example.designpatterns.creational.abstactFactory.elements.Button
import com.example.designpatterns.creational.abstactFactory.elements.TextView

/**
 * @author Evdokimov on 04.03.2022.
 */
interface UIFactory {

    fun createButton(): Button
    fun createTextView(): TextView
}