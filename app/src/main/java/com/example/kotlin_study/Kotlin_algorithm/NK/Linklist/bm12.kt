package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

fun sortInList(head: ListNode?): ListNode?  {
    // write code here
    if (head == null)return null
    var list = mutableListOf<Int>()

    var go = head
    while (go != null){
        list.add(go.`val`)
        go = go.next
    }

    list.sort()

    go = head
    for (num in list){
        go!!.`val` = num
        go = go!!.next
    }

    return head
}