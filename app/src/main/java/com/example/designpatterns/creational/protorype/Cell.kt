package com.example.designpatterns.creational.protorype

/**
 * @author Evdokimov on 04.03.2022.
 */
class Cell(
    private val type: String,
    var size: Int
) : Cloneable {

    override fun clone(): Cell {
        return Cell(
            type = this.type,
            size = this.size
        )
    }
}