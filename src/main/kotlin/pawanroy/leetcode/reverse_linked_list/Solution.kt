package pawanroy.leetcode.reverse_linked_list

class Solution {
    class ListNode(val `val`: Int) {
        var next: ListNode? = null
    }

    fun reverseList(head: ListNode?): ListNode? {
        return getTail(null, head)
    }


    fun getTail(prev: ListNode?, current: ListNode?): ListNode? {
        if (current == null) return current

        val next = current.next
        current.next = prev
        return if (next == null) current
        else getTail(current, next)
    }
}