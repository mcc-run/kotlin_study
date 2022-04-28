package com.example.kotlin_study.Kotlin_algorithm.NK.Tree_kotlin

fun isValidBST(root: TreeNode?): Boolean  {
    // write code here
    if (root == null)return true

    return searchTree(root,Int.MIN_VALUE, Int.MAX_VALUE)
}

fun searchTree(root : TreeNode,min : Int,max : Int) : Boolean{
    if (root.`val` <= min || root.`val` >= max)return false

    root.left?.let { if (!searchTree(it,min,root.`val`)) return false}
    root.right?.let { if (!searchTree(it,root.`val`,max)) return false}

    return true
}