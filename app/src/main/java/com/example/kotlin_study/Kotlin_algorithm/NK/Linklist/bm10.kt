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
        * @param pHead1 ListNode类 
        * @param pHead2 ListNode类 
        * @return ListNode类
    */
    fun FindFirstCommonNode(pHead1: ListNode?, pHead2: ListNode?): ListNode?  {
        // write code here
        if(pHead1 == null || pHead2 == null)return null
        var leng1 = 0
        var leng2 = 0

        var first = pHead1
        while (first != null){
            leng1++
            first = first.next
        }
        var second = pHead2
        while (second != null){
            leng2++
            second = second.next
        }
        if (leng1 < leng2){
            first = pHead2
            second = pHead1
            var temp  = leng1
            leng1 = leng2
            leng2 = temp
        }else{
            first = pHead1
            second = pHead2
        }
        repeat(leng1-leng2){
            first = first!!.next
        }
        while (first != second){
            first = first?.next ?: return null
            second = second?.next ?: return null
        }
        return first
    }
