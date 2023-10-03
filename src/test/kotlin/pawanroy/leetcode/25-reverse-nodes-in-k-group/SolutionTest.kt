package pawanroy.leetcode.`25-reverse-nodes-in-k-group`

import pawanroy.leetcode.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        var root: ListNode? = null
        var cursor: ListNode? = null

        val list = (0..9)
        list.forEach {
            if (cursor == null) {
                cursor = ListNode(it)
                root = cursor
            } else {
                cursor!!.next = ListNode(it)
                cursor = cursor!!.next
            }
        }
        cursor = null
        val expected = listOf(2, 1, 0, 5, 4, 3, 8, 7, 6, 9)
        var expectedRoot: ListNode? = null
        expected.forEach {
            if (cursor == null) {
                cursor = ListNode(it)
                expectedRoot = cursor
            } else {
                cursor!!.next = ListNode(it)
                cursor = cursor!!.next
            }
        }

        val result = sol.reverseKGroup(root, 3)

        var c1 = expectedRoot
        var c2 = result
        while (c1 != null || c2 != null) {
            assertEquals(c1?.`val`, c2?.`val`)
            c1 = c1!!.next
            c2 = c2!!.next
        }
    }
}