import com.example.kotlin_study.Kotlin_algorithm.NK.Linklist.ListNode

/**
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */


/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * @param head ListNode类
 * @param m int整型
 * @param n int整型
 * @return ListNode类
 */
fun reverseBetween(head: ListNode?, m: Int, n: Int): ListNode? {
    // write code here
    val parent = ListNode(0)
    parent.next = head
    var i = 1
//        寻找开始翻转的第一个节点
    var start = parent
    while (i < m) {
        start = start.next!!
        i++
    }
//        开始翻转
    val first = start.next!!
    var (final ,end) = reverse(first,0,n-m)
    start.next!!.next = end
    start.next = final

    return parent.next
}

fun reverse(now : ListNode, index : Int, end : Int) : Pair<ListNode,ListNode?>{
    val next = now.next
    if (index == end)return Pair(now,next)
    val final = reverse(next!!,index+1,end)
    next.next = now
    return final
}
