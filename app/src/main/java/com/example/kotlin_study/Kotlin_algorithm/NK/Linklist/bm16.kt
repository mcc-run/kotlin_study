package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist



private fun deleteDuplicates(head: ListNode?): ListNode?  {
    // write code here

    val zero = ListNode(0)
    zero.next = head
    var pre = zero
    var now = head
    var repeat = Int.MIN_VALUE

    while (now != null){
        if (now.`val` == now.next?.`val` || now.`val` == repeat){
            pre.next = now.next
            repeat = now!!.`val`
            now = pre.next
        }else {
            pre = now
            now = now.next
            repeat = Int.MIN_VALUE
        }
    }



    return zero.next
}