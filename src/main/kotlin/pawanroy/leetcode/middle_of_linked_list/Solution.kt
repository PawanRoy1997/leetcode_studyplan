package pawanroy.leetcode.middle_of_linked_list

import pawanroy.leetcode.ListNode

class Solution {

    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) return head
        val half = head.length()
        var next = head
        repeat(half / 2) { next = next!!.next }
        return if (half % 2 == 0) next else next!!.next
    }

    private fun ListNode.length(size: Int = 0): Int {
        return if (this.next != null) this.next!!.length(size + 1) else size
    }
}