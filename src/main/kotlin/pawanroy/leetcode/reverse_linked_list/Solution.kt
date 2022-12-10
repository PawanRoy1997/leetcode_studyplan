package pawanroy.leetcode.reverse_linked_list

import pawanroy.leetcode.ListNode

class Solution {

    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return head
        return getTail(null, head)
    }

    private fun getTail(prev: ListNode?, current: ListNode): ListNode? {
        val next = current.next
        current.next = prev
        return if (next == null) current
        else getTail(current, next)
    }
}