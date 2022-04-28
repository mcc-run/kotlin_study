package com.example.kotlin_study.Kotlin_algorithm.NK.Tree

import kotlin.math.max


fun maxDepth(root: TreeNode?): Int  {
    // write code here
    if(root == null)return 0
    val left = maxDepth(root.left)
    val right = maxDepth(root.right)

    return max(left,right) + 1
}