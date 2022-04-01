import com.example.kotlin_study.Kotlin_algorithm.NK.Linklist.ListNode

/**
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

    /**
    * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
    *
    * 
        * @param head ListNode类 
        * @return bool布尔型
    */
    fun hasCycle(head: ListNode?): Boolean  {
        // write code here
        var slow : ListNode? = head
        var fast : ListNode? = head
        while (fast != null){
            slow = slow!!.next
            fast = fast!!.next
            fast = fast?.next
            if (slow == fast && fast != null)return true
        }

        return false
    }
