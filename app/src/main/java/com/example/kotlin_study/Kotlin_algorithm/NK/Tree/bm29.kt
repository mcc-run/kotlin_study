package com.example.kotlin_study.Kotlin_algorithm.NK.Tree

fun hasPathSum(root: TreeNode?,sum: Int): Boolean  {
    // write code here
    if (root == null)return false

    return recrusion(root,sum)
}

fun recrusion(root: TreeNode?,sum: Int) : Boolean{
    if (root == null)return false
    if (root.`val` == sum && root.left == null && root.right == null)return true
    if (recrusion(root.left,sum-root.`val`))return true
    if (recrusion(root.right,sum-root.`val`))return true

    return false
}