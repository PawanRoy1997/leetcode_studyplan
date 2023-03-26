package pawanroy.leetcode.`83-remove-duplicates-from-sorted-list`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertEquals
import kotlin.test.assertNull

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val head = null
        assertNull(sol.deleteDuplicates(head))
    }

    @Test
    fun caseTwo() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        assertEquals("123", sol.deleteDuplicates(head).toString())
    }

    @Test
    fun caseThree() {
        val head = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(2).apply {
                        next = ListNode(3).apply {
                            next = ListNode(3)
                        }
                    }
                }
            }
        }
        assertEquals("123", sol.deleteDuplicates(head).toString())
    }
}