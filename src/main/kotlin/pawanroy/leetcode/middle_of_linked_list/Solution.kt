package pawanroy.leetcode.middle_of_linked_list

class Solution {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    private var half = 0
    private var next: ListNode? = null

    fun middleNode(head: ListNode?): ListNode? {
        next = head
        while (next?.next != null) {
            half++
            next = next?.next
        }
        next = head
        repeat(half / 2) { next = next?.next }
        return if(half%2==0)next else next?.next
    }
}