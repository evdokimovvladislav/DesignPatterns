package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.structural.flyweight.trees.Oak
import com.example.designpatterns.structural.flyweight.trees.Pine
import com.example.designpatterns.structural.flyweight.trees.Spruce
import com.example.designpatterns.structural.flyweight.trees.Tree

/**
 * @author Evdokimov on 05.03.2022.
 */
class TreeFactory {

    private val treeMap = mutableMapOf<TreeType, Tree>()

    fun getTree(type: TreeType): Tree {
        var tree = treeMap[type]
        if (tree == null)
            tree = when (type) {
                TreeType.SPRUCE -> Spruce()
                TreeType.OAK -> Oak()
                TreeType.PINE -> Pine()
            }
        return tree
    }
}

enum class TreeType {
    SPRUCE, OAK, PINE
}