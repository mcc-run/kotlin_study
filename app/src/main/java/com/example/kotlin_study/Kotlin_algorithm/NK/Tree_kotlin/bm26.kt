package com.example.kotlin_study.Kotlin_algorithm.NK.Tree_kotlin

import java.util.*


fun levelOrder(root: TreeNode?): Array<IntArray> {
    // write code here
    if (root == null) return emptyArray()

    val array = mutableListOf<IntArray>()

    val tail = TreeNode(Int.MAX_VALUE)
    val queue = LinkedList<TreeNode>()
    queue.add(tail)
    queue.add(root)
    var temp = arrayListOf<Int>()
    while (true){
        val now = queue.pop() ?: break
        if (now === tail){
            if (temp.isEmpty())break
            array.add(temp.toIntArray())
            temp = arrayListOf()
            queue.add(tail)
        }else {
            temp.add(now.`val`)
            now.left?.let { queue.add(it) }
            now.right?.let { queue.add(it) }
        }
    }

    return array.toTypedArray()
}
