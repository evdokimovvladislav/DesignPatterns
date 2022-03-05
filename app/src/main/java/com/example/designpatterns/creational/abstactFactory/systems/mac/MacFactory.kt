package com.example.designpatterns.creational.abstactFactory.systems.mac

import com.example.designpatterns.creational.abstactFactory.UIFactory

/**
 * @author Evdokimov on 04.03.2022.
 */
class MacFactory : UIFactory {

    override fun createButton() = MacButton()

    override fun createTextView() = MacTextView()
}