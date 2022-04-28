package com.example.kotlin_study.Kotlin_algorithm.NK.Tree



fun Print(pRoot: TreeNode?): Array<IntArray>  {
    // write code here
    if (pRoot == null) return emptyArray()

    val array = mutableListOf<IntArray>()

    var now = arrayListOf<TreeNode>()
    var next = arrayListOf<TreeNode>()
    now.add(pRoot)
    var temp = arrayListOf<Int>()
    var isRe = true
    while (now.isNotEmpty()){
        for (tree in now){
            temp.add(tree.`val`)
            if (isRe){
                tree.left?.let { next.add(0,it) }
                tree.right?.let { next.add(0,it) }
            }else {
                tree.right?.let { next.add(0,it) }
                tree.left?.let { next.add(0,it) }
            }
        }
        array.add(temp.toIntArray())
        temp = arrayListOf()
        now.clear()
        now = next
        next = arrayListOf()
        isRe = !isRe
    }

    return array.toTypedArray()
}