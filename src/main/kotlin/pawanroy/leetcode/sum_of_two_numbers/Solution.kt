package pawanroy.leetcode.sum_of_two_numbers

import pawanroy.leetcode.ListNode

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var cursor1 = l1
        var cursor2 = l2
        var result: ListNode? = null
        var cursor3: ListNode? = null
        var carry = false

        while (cursor1 != null || cursor2 != null) {
            val sum = ListNode(cursor1.value() + cursor2.value() + if (carry) 1 else 0)
            carry = sum.`val` > 9
            if (carry) {
                sum.`val` = sum.`val` - 10
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

        if (carry) cursor3?.next = ListNode(1)

        return result
    }

    private fun ListNode?.value() = this?.`val` ?: 0
}
