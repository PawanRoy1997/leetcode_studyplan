package pawanroy.leetcode.middle_of_linked_list

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testCaseOne() {
        val head = Solution.ListNode(1)
        var ptr: Solution.ListNode? = head
        var lastIndex = 0
        repeat(5) {
            ptr?.next = Solution.ListNode(it+2)
            ptr = ptr?.next
            lastIndex = it+2
        }

        val middle = Solution().middleNode(head)
        assertEquals(6,lastIndex)
        assertEquals(4,middle!!.`val`)
    }

    @Test
    fun testCaseTwo() {
        val head = Solution.ListNode(1)
        var ptr: Solution.ListNode? = head
        var lastIndex = 0
        repeat(6) {
            ptr?.next = Solution.ListNode(it+2)
            ptr = ptr?.next
            lastIndex = it+2
        }

        val middle = Solution().middleNode(head)
        assertEquals(7,lastIndex)
        assertEquals(4,middle!!.`val`)
    }
}