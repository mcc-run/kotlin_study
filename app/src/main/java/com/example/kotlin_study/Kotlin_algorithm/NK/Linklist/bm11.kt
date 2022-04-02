import com.example.kotlin_study.Kotlin_algorithm.NK.Linklist.ListNode

/**
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */



    /**
    * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
    * 
        * @param head1 ListNode类 
        * @param head2 ListNode类 
        * @return ListNode类
    */
    fun addInList(head1: ListNode?,head2: ListNode?): ListNode?  {
        // write code here
        if (head1 == null)return head2
        if (head2 == null)return head1
        var first = head1
        var second = head2
        var leng1 = 0
        var leng2 = 0
        while (first != null){
            leng1++
            first = first.next
        }
        while (second != null){
            leng2++
            second = second.next
        }
        var sum : ListNode
        if (leng1 < leng2){
            val temp = leng1
            leng1 = leng2
            leng2 = temp
            first = head2
            sum = head2
            second = head1
        }else{
            first = head1
            sum = head1
            second = head2
        }
        val add = reverse(first,second,leng1-leng2,0)
        if (add != 0){
            val head = ListNode(1)
            head.next = sum
            sum = head
        }
        return sum
    }

    private fun reverse(first : ListNode?,second : ListNode?,start : Int,index : Int) : Int{
        if (first == null || second == null)return 0

        var add = 0

        if (index < start){
            val addNum =  reverse(first!!.next,second,start,index+1)
            first.`val` += addNum
            if (first.`val` == 10){
                first.`val` = 0
                add = 1
            }
        }else{
            val addNum = reverse(first!!.next,second.next,start,index+1)
            first.`val` += addNum + second.`val`
            if (first.`val` >= 10){
                first.`val` -= 10
                add = 1
            }
        }

        return add
    }