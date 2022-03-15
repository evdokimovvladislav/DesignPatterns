package com.example.designpatterns.structural.composite

import com.example.designpatterns.structural.composite.files.Folder
import com.example.designpatterns.structural.composite.files.Photo
import com.example.designpatterns.structural.composite.files.TextDoc

/**
 * @author Evdokimov on 04.03.2022.
 *
 * Позволяет создать древовидную структуру и работать с ней, как с единым объектом.
 */
fun main() {

    val photo1 = Photo()
    val photo2 = Photo()
    val photo3 = Photo()
    val photo4 = Photo()

    val textDoc1 = TextDoc()
    val textDoc2 = TextDoc()
    val textDoc3 = TextDoc()

    val mainFolder = Folder()
    val folder1 = Folder()
    val folder2 = Folder()

    folder1.addComponent(photo1)
    folder1.addComponent(photo2)
    folder1.addComponent(textDoc1)
    folder1.addComponent(textDoc2)

    folder2.addComponent(photo3)
    folder2.addComponent(photo4)

    mainFolder.addComponent(folder1)
    mainFolder.addComponent(folder2)
    mainFolder.addComponent(textDoc3)

    println(mainFolder.children)
    mainFolder.showType()

    mainFolder.removeComponent(folder2)
    println(mainFolder.children)
}