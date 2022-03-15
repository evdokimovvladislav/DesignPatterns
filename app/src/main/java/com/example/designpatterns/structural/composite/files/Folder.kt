package com.example.designpatterns.structural.composite.files

/**
 * @author Evdokimov on 04.03.2022.
 */
class Folder : File {

    val children: List<File>
        get() = components

    private val components = arrayListOf<File>()

    override fun showType() {
        components.forEach {
            it.showType()
        }
    }

    override fun toString(): String = "Folder"

    fun addComponent(file: File) {
        components.add(file)
    }

    fun removeComponent(file: File) {
        components.remove(file)
    }
}