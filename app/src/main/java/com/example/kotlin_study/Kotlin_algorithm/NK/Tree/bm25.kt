package com.example.kotlin_study.Kotlin_algorithm.NK.Tree

private lateinit var nums : ArrayList<Int>

fun postorderTraversal(root: TreeNode?): IntArray  {
    // write code here
    nums = arrayListOf()
    postOrder(root)

    return nums.toIntArray()
}

fun postOrder(root: TreeNode?){
    if (root == null)return

    postOrder(root.left)
    postOrder(root.right)
    nums.add(root.`val`)

}