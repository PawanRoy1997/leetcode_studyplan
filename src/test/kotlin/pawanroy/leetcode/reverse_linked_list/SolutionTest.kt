package pawanroy.leetcode.reverse_linked_list

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertEquals

class SolutionTest{
    @Test
    fun reverseListNode(){
        val head = ListNode(1)
        val tail = ListNode(2)
        head.next = tail

        val reverseList = Solution().reverseList(head)
        assertEquals(reverseList, tail)
    }
    @Test
    fun testNullHead(){
        assertEquals(null, Solution().reverseList(null))
    }
}