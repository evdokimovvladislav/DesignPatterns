package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.structural.flyweight.trees.Tree

/**
 * Класс для посадки деревьев
 *
 * @property treeList лист деревьев для посадки
 * @property xRange пара минимальное значение - максимальное значение координат по оси X
 * @property yRange пара минимальное значение - максимальное значение координат по оси Y
 */
class TreePlanter(
    private val treeList: List<Tree>,
    private val xRange: Pair<Int, Int>,
    private val yRange: Pair<Int, Int>
) {
    private val coordinates = mutableSetOf<Pair<Int, Int>>()
    private var count = coordinates.size

    init {
        if (xRange.first > xRange.second || yRange.first > yRange.second)
            throw RuntimeException("Минимальное значение координат не должно превышать максимальное")
    }

    /**
     * Посадить все деревья из листа, переданного в конструктор класса.
     * Если свободного места нет, то выведет в консоль сообщение об этом
     * для каждого оставшегося дерева.
     */
    fun plant() {
        treeList.forEach {
            plantTree(it)
        }
    }

    private fun plantTree(tree: Tree) {
        if (checkSize()) {
            println("Больше нет свободного места")
            return
        }
        val x = (xRange.first..xRange.second).random()
        val y = (yRange.first..yRange.second).random()
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
        coordinates.size ==
                (xRange.first..xRange.second).count() * (yRange.first..yRange.second).count()
}