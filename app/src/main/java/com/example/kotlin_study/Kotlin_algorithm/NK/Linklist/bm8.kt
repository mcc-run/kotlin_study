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
        * @param k int整型 
        * @return ListNode类
    */

    var tail_k : ListNode? = null


    fun FindKthToTail(pHead: ListNode?,k: Int): ListNode?  {
        // write code here
        recursive(pHead,k)
        return tail_k
    }

    private fun recursive(now : ListNode?,k: Int) : Int{
        if (now == null)return 0
        var index = recursive(now.next,k)+1
        if (index == k)tail_k = now
        return index
    }
