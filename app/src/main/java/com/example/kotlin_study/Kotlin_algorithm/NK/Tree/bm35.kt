package com.example.kotlin_study.Kotlin_algorithm.NK.Tree


var height = -1
var now = -1

fun isCompleteTree(root: TreeNode?): Boolean {
    // write code here
    if (root == null)return true
    return isFull(root,0)
}

fun isFull(root: TreeNode,level : Int) : Boolean {

    root.left?.let { if (!isFull(it,level+1))return false }
    if (root.left == null && root.right == null){
        if (height == -1){
            height = level
            now = level
        }else {
            if (level < height - 1)return false
            if (level > height)return false
            return when(now){
                level -> true
                height -> {
                    now = height - 1
                    true
                }
                else -> false
            }
        }
        true
    }else if (root.left == null)return false
    else {
         return if(root.right == null){
            if (height == level+1){
                now = level
                true
            }else false
        }else isFull(root.right!!,level+1)
    }
    return true
}

