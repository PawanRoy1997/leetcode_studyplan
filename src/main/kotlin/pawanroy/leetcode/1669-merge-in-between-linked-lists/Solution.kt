package pawanroy.leetcode.`1669-merge-in-between-linked-lists`

import pawanroy.leetcode.ListNode

class Solution {
    fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        var nodeStart = list1
        var nodeEnd = list1

        for (i in 0..b) {
            if (i < a-1) nodeStart = nodeStart?.next
            nodeEnd = nodeEnd?.next
        }

        nodeStart?.next = list2
        while (nodeStart?.next != null) {
            nodeStart = nodeStart.next
        }

        nodeStart?.next = nodeEnd

        return list1
    }
}