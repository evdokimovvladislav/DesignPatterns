package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.structural.flyweight.trees.Tree

/**
 * Класс для посадки деревьев
 */
class TreePlanter {

    private var xMin: Int = DEFAULT_VALUE
    private var xMax: Int = DEFAULT_VALUE
    private var yMin: Int = DEFAULT_VALUE
    private var yMax: Int = DEFAULT_VALUE

    private val coordinates = mutableSetOf<Pair<Int, Int>>()
    private var count = coordinates.size

    /**
     * Посадить все деревья из листа деревьев.
     * Если свободного места нет, то выведет в консоль сообщение об этом
     * для каждого оставшегося дерева.
     * Если минимальное значение координат превышает максимальное, то выбрасывает исключение
     * RuntimeException("Минимальное значение координат не должно превышать максимальное")
     *
     * @param treeList лист деревьев для посадки
     * @param xRange пара минимальное значение - максимальное значение координат по оси X
     * @param yRange пара минимальное значение - максимальное значение координат по оси Y
     */
    fun plant(treeList: List<Tree>, xRange: Pair<Int, Int>, yRange: Pair<Int, Int>) {
        if (xRange.first > xRange.second || yRange.first > yRange.second)
            throw RuntimeException("Минимальное значение координат не должно превышать максимальное")

        xMin = xRange.first
        xMax = xRange.second
        yMin = yRange.first
        yMax = yRange.second

        treeList.forEach {
            plantTree(it)
        }
    }

    private fun plantTree(tree: Tree) {
        if (checkSize()) {
            println("Больше нет свободного места")
            return
        }
        val x = (xMin..xMax).random()
        val y = (yMin..yMax).random()
        val pair = x to y
        coordinates.add(pair)
        if (coordinates.size == count) {
            plantTree(tree)
        } else {
            count++
            tree.plant(x, y)
        }
    }

    private fun checkSize() =
        coordinates.size == (xMin..xMax).count() * (yMin..yMax).count()

    private companion object {
        const val DEFAULT_VALUE = 0
    }
}