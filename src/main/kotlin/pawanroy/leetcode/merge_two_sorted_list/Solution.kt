package pawanroy.leetcode.merge_two_sorted_list

import pawanroy.leetcode.ListNode

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1 == null && list2 == null) return null
        if(list1 != null && list2 == null) return list1
        if(list2 != null && list1 == null) return list2
        return if(list1!!.`val` > list2!!.`val`) list2.apply { next = mergeTwoLists(list1, list2.next) }
        else list1.apply { next = mergeTwoLists(list1.next, list2) }
    }
}