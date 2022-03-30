import com.example.kotlin_study.Kotlin_algorithm.NK.Linklist.ListNode

//BM1


fun ReverseList(head: ListNode?): ListNode? {
    // write code here
    if (head == null || head.next == null) return head
    else if (head!!.next!!.next == null) {
        val temp = head.`val`
        head.`val` = head.next!!.`val`
        head.next!!.`val` = temp
        return head
    }
    var first: ListNode = head
    var second: ListNode = head.next!!
    var thirst = head.next!!.next
    head.next = null
    while (thirst != null) {
        second.next = first
        first = second
        second = thirst
        thirst = second.next
    }
    second.next = first
    return second
}
