package pawanroy.leetcode.`141-linked-list-cycle`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val head = ListNode(1).apply {
            next = ListNode(2)
        }
        head.next!!.apply {
            next = ListNode(0).apply {
                next = ListNode(-4).apply {
                    next = head.next
                }
            }
        }
        assertTrue(sol.hasCycle(head))
    }

    @Test
    fun caseTwo() {
        val head = ListNode(1).apply {
            next = ListNode(2)
        }
        assertFalse(sol.hasCycle(head))
    }
}