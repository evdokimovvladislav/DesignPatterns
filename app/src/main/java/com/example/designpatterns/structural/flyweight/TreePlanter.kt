package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.structural.flyweight.trees.Tree

/**
 * Класс для посадки деревьев
 */
class TreePlanter {

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
    fun plant(treeList: List<Tree>, xRange: Pair<Int, Int>, yRange: Pair<Int, Int>): Boolean {
        checkRangeOrientation(xRange, yRange)
        checkPossibilityOfAlg(treeList.size, xRange, yRange)
        return plantTrees(treeList, xRange, yRange)
    }

    private fun checkRangeOrientation(xRange: Pair<Int, Int>, yRange: Pair<Int, Int>) {
        if (xRange.first > xRange.second || yRange.first > yRange.second)
            throw IllegalArgumentException("Минимальное значение координат не должно превышать максимальное")
    }

    private fun checkPossibilityOfAlg(size: Int, xRange: Pair<Int, Int>, yRange: Pair<Int, Int>) {
        if (size > (xRange.first..xRange.second).count() * (yRange.first..yRange.second).count())
            throw IllegalArgumentException("Размер массива больше возможного лимита посадки")
    }

    private fun plantTrees(
        treeList: List<Tree>,
        xRange: Pair<Int, Int>,
        yRange: Pair<Int, Int>
    ): Boolean {
        val freeSlots = mutableSetOf<Pair<Int, Int>>()
        (xRange.first..xRange.second).forEach { x ->
            (yRange.first..yRange.second).forEach { y ->
                freeSlots.add(x to y)
            }
        }

        treeList.forEach { tree ->
            freeSlots.random().also { pair ->
                tree.plant(pair.first, pair.second)
                freeSlots.remove(pair)
            }
        }
        return true
    }
}