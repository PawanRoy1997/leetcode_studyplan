package pawanroy.leetcode.middle_of_linked_list

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testCaseOne() {
        val head = ListNode(1)
        var ptr: ListNode? = head
        var lastIndex = 0
        repeat(5) {
            ptr?.next = ListNode(it + 2)
            ptr = ptr?.next
            lastIndex = it + 2
        }

        val middle = Solution().middleNode(head)
        assertEquals(6, lastIndex)
        assertEquals(4, middle!!.`val`)
    }

    @Test
    fun testCaseTwo() {
        val head = ListNode(1)
        var ptr: ListNode? = head
        var lastIndex = 0
        repeat(6) {
            ptr?.next = ListNode(it + 2)
            ptr = ptr?.next
            lastIndex = it + 2
        }

        val middle = Solution().middleNode(head)
        assertEquals(7, lastIndex)
        assertEquals(4, middle!!.`val`)
    }

    @Test
    fun testCaseThree() {
        assertEquals(null, Solution().middleNode(null))
    }
}