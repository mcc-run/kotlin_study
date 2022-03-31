import com.example.kotlin_study.Kotlin_algorithm.NK.Linklist.ListNode
import kotlinx.coroutines.flow.merge

/**
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 *
 * @param lists ListNode类一维数组
 * @return ListNode类
 */

/*
* 归并排序
* */

var first = mutableListOf<ListNode?>()
var second = mutableListOf<ListNode?>()
var now = true


fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    // write code here
    if(lists.size == 0)return null
    first = lists.toMutableList()
    while ((now && first.size > 1) || (!now && second.size > 1)) {
        var list = first
        if (!now){
            list = second
            first.clear()
        }else second.clear()
        for (i in 1 until list.size step 2) {
            if (!now)first.add(Merge(list[i-1], list[i]))
            else second.add(Merge(list[i-1], list[i]))
        }
        if (list.size % 2 != 0) {
            if (!now) first.add(list[list.size - 1])
            else second.add(list[list.size - 1])
        }
        now = !now
    }
    if (now) return first[0]
    return second[0]
}

private fun Merge(pHead1: ListNode?, pHead2: ListNode?): ListNode? {
    // write code here
    if (pHead1 == null) return pHead2
    if (pHead2 == null) return pHead1
    var head: ListNode? = null
    var now: ListNode
    var first: ListNode?
    var second: ListNode?
    if (pHead1.`val` <= pHead2.`val`) {
        head = pHead1
        now = pHead1
        first = pHead1.next
        second = pHead2
    } else {
        head = pHead2
        now = pHead2
        first = pHead1
        second = pHead2.next
    }
    while (first != null && second != null) {
        if (first.`val` < second.`val`) {
            now.next = first
            now = first
            first = first.next
        } else {
            now.next = second
            now = second
            second = second.next
        }
    }
    if (first == null) now.next = second
    else now.next = first
    return head
}