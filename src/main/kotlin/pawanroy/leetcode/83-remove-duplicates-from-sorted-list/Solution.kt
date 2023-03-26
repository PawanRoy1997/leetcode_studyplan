package pawanroy.leetcode.`83-remove-duplicates-from-sorted-list`

import pawanroy.leetcode.ListNode

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null
        var ptr = head
        while (ptr != null) {
            if (ptr.`val` == ptr.next?.`val`) ptr.next = ptr.next?.next
            else ptr = ptr.next
        }

        return head
    }
}