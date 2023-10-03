package pawanroy.leetcode.`25-reverse-nodes-in-k-group`

import pawanroy.leetcode.ListNode

class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        if(head == null) return null
        var endNode: ListNode? = head

        for(i in 0 until k){
            if(endNode == null) return head
            endNode = endNode.next
        }

        var tail: ListNode? = reverseKGroup(endNode, k)
        var ptr1:ListNode? = head
        var ptr2: ListNode?

        while(ptr1 != endNode){
            ptr2 = ptr1?.next
            ptr1?.next = tail
            tail = ptr1
            ptr1 = ptr2
        }

        return tail
    }
}