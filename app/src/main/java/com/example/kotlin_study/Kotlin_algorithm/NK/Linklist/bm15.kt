package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

fun main(){
    deleteDuplicates(null)
}

private fun deleteDuplicates(head: ListNode?): ListNode?  {
    // write code here
    val number = IntArray(201)
    if (head == null)return null
    var now = head
    number[now!!.`val` + 100]++
    while (now!!.next != null){
        val temp = now!!.next
        if (number[temp!!.`val` + 100] != 0){
            now.next = temp.next
        }else {
            now = now.next
            number[now!!.`val` + 100]++
        }
    }

    return head
}