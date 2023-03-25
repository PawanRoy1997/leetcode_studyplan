package pawanroy.leetcode.`141-linked-list-cycle`

import pawanroy.leetcode.ListNode

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false
        if (head.next == null) return false

        var slow = head
        var fast = head.next

        while (slow!! != fast!!) {
            if (fast.next == null) return false
            if (fast.next!!.next == null) return false
            slow = slow.next
            fast = fast.next!!.next
        }

        return true
    }
}