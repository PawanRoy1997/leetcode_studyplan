package pawanroy.leetcode.reverse_linked_list

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    @Test
    fun reverseListNode(){
        val head = Solution.ListNode(1)
        val tail = Solution.ListNode(2)
        head.next = tail

        val reverseList = Solution().getTail(null, head)
        assertEquals(reverseList, tail)
    }
}