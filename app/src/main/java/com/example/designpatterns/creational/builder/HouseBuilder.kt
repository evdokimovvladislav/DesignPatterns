package com.example.designpatterns.creational.builder

/**
 * @author Evdokimov on 04.03.2022.
 */
class HouseBuilder {

    private var walls: String = "Default wall producer"
    private var door: String = "Default door producer"
    private var roof: String = "Default roof producer"
    private var window: String = "Default window producer"

    fun buildWalls(walls: String): HouseBuilder {
        this.walls = walls
        return this
    }

    fun buildDoor(door: String): HouseBuilder {
        this.door = door
        return this
    }

    fun buildRoof(roof: String): HouseBuilder {
        this.roof = roof
        return this
    }

    fun buildWindow(window: String): HouseBuilder {
        this.window = window
        return this
    }

    fun build() = House(
        walls = walls,
        door = door,
        roof = roof,
        window = window
    )
}