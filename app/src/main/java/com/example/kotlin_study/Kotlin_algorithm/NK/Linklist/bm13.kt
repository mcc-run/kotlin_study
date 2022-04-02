package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist



var start : ListNode? = null

fun isPail(head: ListNode?): Boolean  {
    // write code here
    if (head == null)return true
    start = head
    var end = head

    return reverse(end)
}

private fun reverse(end: ListNode?): Boolean{
    if (end == null)return true
    if (!reverse(end?.next))return false
    if (end.`val` != start!!.`val`)return false
    start = start!!.next
    return true
}