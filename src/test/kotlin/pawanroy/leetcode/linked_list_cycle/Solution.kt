package pawanroy.leetcode.linked_list_cycle

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertEquals
import kotlin.test.assertNull

class SolutionTest {

    @Test
    fun testCaseOne() {
        val head = ListNode(0)
        val detectCycle = Solution().detectCycle(head)
        assertEquals(null, detectCycle)
    }

    @Test
    fun testCaseTwo() {
        val head = ListNode(0)
        head.next = ListNode(1)
        val detectCycle = Solution().detectCycle(head)
        assertEquals(null, detectCycle)
    }

    @Test
    fun testCaseThree() {
        val head = ListNode(0)
        var node = head
        repeat(10) {
            node.next = ListNode(it)
            node = node.next!!
        }
        val detectCycle = Solution().detectCycle(head)
        assertEquals(null, detectCycle)
    }

    @Test
    fun testCaseFour() {
        val head = ListNode(0)
        val cycle = ListNode(1)
        head.next = cycle
        var node = cycle
        repeat(10) {
            node.next = ListNode(it)
            node = node.next!!
        }
        node.next = cycle
        val detectCycle = Solution().detectCycle(head)
        assertEquals(cycle, detectCycle)
    }

    @Test
    fun testNullHead(){
        assertNull(Solution().detectCycle(null))
    }
}