package pawanroy.leetcode.`2-add-two-numbers`

import pawanroy.leetcode.ListNode

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var cursor1 = l1
        var cursor2 = l2
        var result: ListNode? = null
        var cursor3: ListNode? = null

        while (cursor1 != cursor2) {
            val sum = ListNode(cursor1.value() + cursor2.value())
            if (sum.`val` >= 10) {
                sum.`val` = sum.`val` - 10
                if (cursor1!!.next == null) cursor1.next = ListNode(1)
                else cursor1.next!!.`val`++
            }
            if (cursor3 == null) {
                cursor3 = sum
                result = cursor3
            } else {
                cursor3.next = sum
                cursor3 = cursor3.next
            }

            cursor1 = cursor1?.next
            cursor2 = cursor2?.next
        }

        return result
    }

    private fun ListNode?.value() = this?.`val` ?: 0
}
