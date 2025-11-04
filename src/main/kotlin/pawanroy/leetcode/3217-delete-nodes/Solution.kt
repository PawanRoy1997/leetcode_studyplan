package pawanroy.leetcode.`3217-delete-nodes`

import pawanroy.leetcode.ListNode

class Solution {
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        val invalid = mutableMapOf<Int, Boolean>()
        nums.forEach { invalid[it] = true }

        var result: ListNode? = null
        var next: ListNode? = null
        var current = head

        while (current != null) {
            if (invalid[current.`val`] == null) {
                if (result == null) {
                    result = current
                } else {
                    next!!.next = current
                }
                next = current
            }
            current = current.next
        }
        next!!.next = null

        return result
    }
}