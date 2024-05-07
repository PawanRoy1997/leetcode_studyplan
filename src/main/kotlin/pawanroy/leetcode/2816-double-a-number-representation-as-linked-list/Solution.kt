package pawanroy.leetcode.`2816-double-a-number-representation-as-linked-list`

import pawanroy.leetcode.ListNode

class Solution {
    fun doubleIt(head: ListNode?): ListNode? {
        if(head == null) return head

        val l = doubleValue(head)
        if(l > 0){
            val res = ListNode(1)
            res.next = head

            return res
        }


        return head
    }

    private fun doubleValue(head: ListNode?): Int{
        if(head == null) return 0
        var rem = 0
        if(head.next != null){
            rem = doubleValue(head.next)
        }
        val n = (head.`val`*2) + rem
        head.`val` = n % 10
        return n/10
    }

}