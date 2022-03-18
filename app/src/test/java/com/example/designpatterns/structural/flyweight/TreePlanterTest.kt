package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.structural.flyweight.trees.Oak
import com.example.designpatterns.structural.flyweight.trees.Tree
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TreePlanterTest {

    private val planter = TreePlanter()

    @Test(expected = IllegalArgumentException::class)
    fun `should throw exception when coordinates min value more than max value`() {
        val testXRange = 3 to 0
        val testYRange = -1 to -5
        val list = createTreeList(3)

        planter.plant(list, testXRange, testYRange)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `should throw exception when list size more than coordinate combinations`() {
        val testXRange = 0 to 2
        val testYRange = 0 to 2
        val list = createTreeList(20)

        planter.plant(list, testXRange, testYRange)
    }

    @Test
    fun `should plant all trees from list`() {
        val testXRange = 0 to 4
        val testYRange = 0 to 4
        val list = createTreeList(25)

        Assert.assertTrue(planter.plant(list, testXRange, testYRange))
    }

    private fun createTreeList(size: Int) = mutableListOf<Tree>().apply {
        repeat(size) {
            add(Oak())
        }
    }
}