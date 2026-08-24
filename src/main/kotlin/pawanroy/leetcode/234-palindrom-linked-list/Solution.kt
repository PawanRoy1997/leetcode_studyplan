package pawanroy.leetcode.`234-palindrom-linked-list`

import pawanroy.leetcode.ListNode
import java.util.LinkedList
import java.util.Queue

class Solution {
    private val queue: Queue<Int> = LinkedList()
    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) return true
        queue.add(head.`val`)
        return isPalindrome(head.next) && queue.poll() == head.`val`
    }
}