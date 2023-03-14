package pawanroy.leetcode.`23-merge-k-sorted-lists`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(null, sol.mergeKLists(arrayOf(null)))
    }

    @Test
    fun caseTwo() {
        val list1 = ListNode(1)
        list1.createNode(4)
            .createNode(5)
        val list2 = ListNode(1)
        list2.createNode(3)
            .createNode(4)
        val list3 = ListNode(2)
        list3.createNode(6)

        val result = ListNode(1)
        result.createNode(1)
            .createNode(2)
            .createNode(3)
            .createNode(4)
            .createNode(4)
            .createNode(5)
            .createNode(6)
        assertEquals(result.toString(), sol.mergeKLists(arrayOf(list1, list2, list3)).toString())
    }

    private fun ListNode.createNode(value: Int): ListNode {
        val node = ListNode(value)
        next = node
        return node
    }
}