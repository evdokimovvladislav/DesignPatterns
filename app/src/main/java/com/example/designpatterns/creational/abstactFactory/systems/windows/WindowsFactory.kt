package com.example.designpatterns.creational.abstactFactory.systems.windows

import com.example.designpatterns.creational.abstactFactory.UIFactory

/**
 * @author Evdokimov on 04.03.2022.
 */
class WindowsFactory : UIFactory {

    override fun createButton() = WindowsButton()

    override fun createTextView() = WindowsTextView()
}