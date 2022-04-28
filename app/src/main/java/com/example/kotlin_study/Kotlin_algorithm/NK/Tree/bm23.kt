package com.example.kotlin_study.Kotlin_algorithm.NK.Tree

private lateinit var nums : ArrayList<Int>

fun preorderTraversal(root: TreeNode?): IntArray {
    // write code here
    nums = arrayListOf()

    preOrder(root)

    return nums.toIntArray()
}

fun preOrder(root: TreeNode?){
    if (root == null)return

    nums.add(root.`val`)
    preOrder(root.left)
    preOrder(root.right)

}