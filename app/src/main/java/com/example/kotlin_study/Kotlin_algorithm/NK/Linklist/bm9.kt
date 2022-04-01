import com.example.kotlin_study.Kotlin_algorithm.NK.Linklist.ListNode

/**
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

fun main(){
    val head = ListNode(1)
    removeNthFromEnd(head,1)
}

/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * @param head ListNode类
 * @param n int整型
 * @return ListNode类
 */
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    // write code here
    if (head?.next == null) return null
    var zero = ListNode(0)
    zero.next = head
    recursive(zero,n)
    return zero.next
}

private fun recursive(now: ListNode?, k: Int): Int {
    if (now == null) return 0
    var index = recursive(now.next, k)
    if (index == k) {
        now.next = now.next!!.next
    }
    return index + 1
}
