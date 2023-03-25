package pawanroy.leetcode.`203-remove-linked-list-elements`

import pawanroy.leetcode.ListNode

class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) return null
        var ptr: ListNode? = head
        while (ptr != null) {
            if (ptr.next?.`val` == `val`) ptr.next = ptr.next?.next
            else ptr = ptr.next
        }
        return if (head.`val` == `val`) head.next else head
    }
}