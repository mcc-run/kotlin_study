package com.example.kotlin_study.Kotlin_algorithm.NK.Tree

private lateinit var nums : ArrayList<Int>

fun inorderTraversal(root: TreeNode?): IntArray  {
    // write code here
    nums = arrayListOf()
    infixOrder(root)

    return nums.toIntArray()
}

fun infixOrder(root: TreeNode?){
    if (root == null)return

    infixOrder(root.left)
    nums.add(root.`val`)
    infixOrder(root.right)
}