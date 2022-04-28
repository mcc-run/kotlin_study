package com.example.kotlin_study.Kotlin_algorithm.NK.Tree

fun mergeTrees(t1: TreeNode?,t2: TreeNode?): TreeNode?  {
    // write code here

    if (t1 == null)return t2
    if (t2 == null)return t1

    merge(t1,t2)

    return t1
}

fun merge(t1 : TreeNode,t2 : TreeNode){

    t1.`val` += t2.`val`

    if (t2.left == null && t2.right == null)return
    if (t1.left == null)t1.left = t2.left
    else t2.left?.let { merge(t1.left!!,it) }
    if (t1.right == null)t1.right = t2.right
    else t2.right?.let { merge(t1.right!!,it) }

}