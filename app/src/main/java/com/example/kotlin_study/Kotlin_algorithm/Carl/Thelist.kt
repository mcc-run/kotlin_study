package com.example.kotlin_study.Kotlin_algorithm.Carl

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

//移除链表元素
fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var zero = ListNode(0)
    zero.next = head
    var next = zero
    while (next.next != null){
        if (next.next!!.`val` == `val`)next.next = next.next!!.next
        else next = next.next!!
    }
    return zero.next
}