import com.example.kotlin_study.Kotlin_algorithm.NK.Linklist.ListNode

/**
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

fun main() {
    val head = ListNode(1)
    var now : ListNode? = head
    for (i in 2..5){
        val temp = ListNode(i)
        now?.next = temp
        now = temp
    }
    now?.next = null
    reverseKGroup(head,2)
    now = head
    while (now != null){
        println(now.`val`)
        now = now.next
    }
}



    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */

    val queue = mutableListOf<ListNode?>()

    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        // write code here
        if (head == null || k == 1)return head
        reverse(head,0,k)
        return queue[0]
    }

    fun reverse(now: ListNode?, index: Int, k: Int): Boolean {
//        返回
        if (now == null){
            if (index == 0){
                queue.add(now)
                return true
            }
            return false
        }

//        递归
        val next = now.next
        var value = reverse(next,(index+1)%k,k)
        if (value && k!=index+1){
            next?.next = now
        }
        if (k == index+1){
            value = true
            queue.add(now)
        }else if (index == 0){
            if (value){
                val tail = queue[0]
                queue.removeFirst()
                now.next = tail
            }
            else{
                queue.add(now)
            }
        }
        return value
    }

