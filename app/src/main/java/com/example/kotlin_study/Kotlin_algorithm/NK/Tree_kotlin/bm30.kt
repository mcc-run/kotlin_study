package com.example.kotlin_study.Kotlin_algorithm.NK.Tree_kotlin

var head : TreeNode? = null
var pre : TreeNode? = null


fun Convert(pRootOfTree: TreeNode?): TreeNode? {
    // write code here
    if (pRootOfTree == null)return null

    convert(pRootOfTree)

    return head
}

fun convert(tree: TreeNode?) {
    if (tree == null)return

    convert(tree.left)
    if (pre == null){
        head = tree
        pre = tree
        tree.left = null
    }else {
        pre!!.right = tree
        tree.left = pre
        pre = tree
    }
    convert(tree.right)

}

