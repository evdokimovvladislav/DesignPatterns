package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.structural.flyweight.trees.Tree

/**
 * @author Evdokimov on 05.03.2022.
 *
 * Позволяет не создавать много однотипных объектов, переиспользуя уже созланные, а если
 * таких нет, то создает их
 */
fun main() {
    val treeFactory = TreeFactory()

    val forest = mutableListOf<Tree>()

    forest.add(treeFactory.getTree(TreeType.OAK))
    forest.add(treeFactory.getTree(TreeType.PINE))
    forest.add(treeFactory.getTree(TreeType.SPRUCE))
    forest.add(treeFactory.getTree(TreeType.SPRUCE))
    forest.add(treeFactory.getTree(TreeType.OAK))

    forest.forEach{
        it.plant(
            (0..100).random(),
            (0..100).random())
    }
}