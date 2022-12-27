package pawanroy.leetcode.reverse_linked_list

import pawanroy.leetcode.ListNode

class Solution {

    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null
        var result: ListNode? = null
        var next:ListNode? = head
        while (next != null) {
            val swap = next
            next = next.next
            swap.next = result
            result = swap
        }
        return result
    }
}