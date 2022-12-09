package pawanroy.leetcode.linked_list_cycle

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {

    fun detectCycle(head: ListNode?): ListNode? {
        if (head == null) return null
        var node = head
        while (node?.`val` != -10000) {
            if (node?.next == null) {
                node = null
                break
            }
            node.`val` = -10000
            node = node.next
        }
        return node
    }
}