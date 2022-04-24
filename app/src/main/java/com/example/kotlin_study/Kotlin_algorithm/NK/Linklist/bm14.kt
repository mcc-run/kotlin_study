package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

fun oddEvenList(head: ListNode?): ListNode? {
    // write code here
    if (head?.next?.next == null) return head


    var first = head
    var second = first.next
    val tail = second
    var now = second?.next

    var i  = 3
    while (now != null){
        val temp = now.next
        if (i % 2 == 0){
            second!!.next = now
            second = second.next
        }else {
            first!!.next = now
            first = first.next
        }
        now = temp
        i++
    }
    first?.next = tail
    second!!.next = null

    return head
}