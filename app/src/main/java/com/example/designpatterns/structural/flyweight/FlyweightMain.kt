package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.structural.flyweight.trees.Tree

/**
 * @author Evdokimov on 05.03.2022.
 *
 * Позволяет не создавать много однотипных объектов, переиспользуя уже созланные, а если
 * таких нет, то создает их
 */
fun main() {
    val forest = makeForest()

    val planter = TreePlanter()
    planter.plant(forest, 0 to 20, 0 to 2)
}

private fun makeForest(): List<Tree> = TreeFactory().run {
    mutableListOf<Tree>().apply {
        add(getTree(TreeType.OAK))
        add(getTree(TreeType.PINE))
        add(getTree(TreeType.SPRUCE))
        add(getTree(TreeType.SPRUCE))
        add(getTree(TreeType.OAK))
        add(getTree(TreeType.OAK))
        add(getTree(TreeType.PINE))
        add(getTree(TreeType.SPRUCE))
        add(getTree(TreeType.SPRUCE))
        add(getTree(TreeType.OAK))
        add(getTree(TreeType.OAK))
        add(getTree(TreeType.PINE))
        add(getTree(TreeType.SPRUCE))
        add(getTree(TreeType.SPRUCE))
        add(getTree(TreeType.OAK))
    }
}