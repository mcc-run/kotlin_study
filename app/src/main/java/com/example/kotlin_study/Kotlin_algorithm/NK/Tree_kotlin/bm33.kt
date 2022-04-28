package com.example.kotlin_study.Kotlin_algorithm.NK.Tree_kotlin

fun Mirror(pRoot: TreeNode?): TreeNode?  {
    // write code here

    if (pRoot == null)return pRoot
    Mirror(pRoot.left)
    Mirror(pRoot.right)

    val temp = pRoot.left
    pRoot.left = pRoot.right
    pRoot.right = temp

    return pRoot
}