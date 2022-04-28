package com.example.kotlin_study.Kotlin_algorithm.NK.Tree

fun isSymmetrical(pRoot: TreeNode?): Boolean  {
    // write code here
    if (pRoot == null)return true
    pRoot.let {
        if (it.left == null && it.right != null || it.left != null && it.right == null)return false
    }

    return compare(pRoot.left,pRoot.right)
}

fun compare(left : TreeNode? , right : TreeNode?) : Boolean{
    if (left == null && right == null)return true
    else if (left == null)return false
    else if (right == null)return false
    else if (left.`val` != right.`val`)return false

    if (!compare(left.left,right.right))return false
    if (!compare(left.right,right.left))return false

    return true
}