package com.example.designpatterns.structural.composite.files

/**
 * @author Evdokimov on 04.03.2022.
 */
class Folder : File {

    private val components = arrayListOf<File>()

    override fun showType() {
        components.forEach {
            it.showType()
        }
    }

    fun addComponent(file: File) {
        components.add(file)
    }
}