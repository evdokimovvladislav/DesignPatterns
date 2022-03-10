package com.example.designpatterns.creational.builder

/**
 * @author Evdokimov on 04.03.2022.
 */
class HouseBuilder {

    private var walls: String = "Default wall producer"
    private var door: String = "Default door producer"
    private var roof: String = "Default roof producer"
    private var window: String = "Default window producer"

    fun setWalls(walls: String): HouseBuilder = apply { this.walls = walls }

    fun setDoor(door: String): HouseBuilder = apply { this.door = door }

    fun setRoof(roof: String): HouseBuilder = apply { this.roof = roof }

    fun setWindow(window: String): HouseBuilder = apply { this.window = window }

    fun build() = House(
        walls = walls,
        door = door,
        roof = roof,
        window = window
    )
}