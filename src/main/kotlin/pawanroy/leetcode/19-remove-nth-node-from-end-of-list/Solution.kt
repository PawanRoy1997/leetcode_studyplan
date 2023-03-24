package pawanroy.leetcode.`19-remove-nth-node-from-end-of-list`

import pawanroy.leetcode.ListNode

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head == null) return null

        var ptrH = head
        var ptrT = head

        for (i in 0 until n) ptrH = ptrH?.next

        if (ptrH == null) return null

        while (ptrH!!.next != null) {
            ptrH = ptrH.next
            ptrT = ptrT!!.next
        }

        ptrT!!.next = ptrT.next!!.next

        return head
    }
}