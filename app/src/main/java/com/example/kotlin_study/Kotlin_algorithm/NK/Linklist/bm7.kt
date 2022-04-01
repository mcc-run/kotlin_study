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
        * @param pHead ListNode类 
        * @return ListNode类
    */
    fun EntryNodeOfLoop(pHead: ListNode?): ListNode?  {
        // write code here
        if (pHead == null)return null
        var slow : ListNode? = pHead.next
        var fast : ListNode? = pHead.next?.next ?: return null
        while (slow != fast){
            slow = slow!!.next
            fast = fast?.next?.next ?: return null
        }
        slow = pHead
        while (slow != fast){
            slow = slow!!.next
            fast = fast!!.next
        }
        return slow
    }
