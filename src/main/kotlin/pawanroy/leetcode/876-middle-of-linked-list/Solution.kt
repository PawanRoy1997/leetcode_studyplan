package pawanroy.leetcode.`876-middle-of-linked-list`

import pawanroy.leetcode.ListNode

class Solution {

    fun middleNode(head: ListNode?): ListNode? {
        var cursor: ListNode? = head
        var half = cursor
        while (cursor?.next != null) {
            cursor = cursor.next!!.next ?: cursor.next
            half = half!!.next
        }
        return half
    }
}