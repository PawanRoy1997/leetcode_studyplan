package pawanroy.leetcode.linked_list_cycle

import pawanroy.leetcode.ListNode

class Solution {

    fun detectCycle(head: ListNode?): ListNode? {
        if(head == null) return null
        if(head.`val` == -10000) return head
        head.`val` = -10000
        return detectCycle(head.next)
    }
}