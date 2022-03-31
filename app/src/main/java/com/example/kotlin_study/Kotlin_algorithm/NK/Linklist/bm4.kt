import com.example.kotlin_study.Kotlin_algorithm.NK.Linklist.ListNode

/**
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */



    /**
    * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
    * 
        * @param pHead1 ListNode类 
        * @param pHead2 ListNode类 
        * @return ListNode类
    */
 private   fun Merge(pHead1: ListNode?, pHead2: ListNode?): ListNode?  {
        // write code here
        if (pHead1 == null)return pHead2
        if (pHead2 == null)return pHead1
        var head : ListNode? = null
        var now : ListNode
        var first : ListNode?
        var second : ListNode?
        if (pHead1.`val` <= pHead2.`val`){
            head = pHead1
            now = pHead1
            first = pHead1.next
            second = pHead2
        }else{
            head = pHead2
            now = pHead2
            first = pHead1
            second = pHead2.next
        }
        while (first != null && second != null){
            if (first.`val` < second.`val`){
                now.next = first
                now = first
                first = first.next
            }else {
                now.next = second
                now = second
                second = second.next
            }
        }
        if (first == null)now.next = second
        else now.next = first
        return head
    }
