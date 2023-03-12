package pawanroy.leetcode.merge_k_sorted_linked_lists

import pawanroy.leetcode.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) return null
        var node: ListNode? = null
        var index = -1
        lists.forEachIndexed { i, it ->
            if (it == null) return@forEachIndexed
            if (node == null || (it.`val` < node!!.`val`)) {
                node = it
                index = i
            }
        }

        if(node == null) return node

        lists[index] = lists[index]?.next
        node?.next = mergeKLists(lists)

        return node
    }
}