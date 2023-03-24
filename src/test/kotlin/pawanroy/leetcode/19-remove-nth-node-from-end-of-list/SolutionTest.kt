package pawanroy.leetcode.`19-remove-nth-node-from-end-of-list`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertEquals
import kotlin.test.assertNull

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseNull() {
        assertNull(sol.removeNthFromEnd(null, 1))
    }

    @Test
    fun caseRemove2nd() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }
        assertEquals(head, sol.removeNthFromEnd(head, 2), "Expected: 13, GOT: $head")
    }
}