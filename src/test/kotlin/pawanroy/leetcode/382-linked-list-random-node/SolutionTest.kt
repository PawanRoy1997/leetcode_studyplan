package pawanroy.leetcode.`382-linked-list-random-node`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertContains

class SolutionTest {
    private fun getNode(value: Int, next: ListNode? = null) = ListNode(value).apply { this.next = next }

    @Test
    fun caseOne() {
        val solution = Solution(
            getNode(1, getNode(2, getNode(3)))
        )
        val results = ArrayList<Int>()
        for (i in 0..100) {
            results.add(solution.getRandom())
        }
        assertContains(results, 1)
        assertContains(results, 2)
        assertContains(results, 3)
    }

    @Test
    fun caseTwo() {
        val solution = Solution(
            getNode(1, getNode(2, getNode(3)))
        )
        val results = ArrayList<Int>()
        for (i in 0..4999) {
            results.add(solution.getRandom())
        }
        assertContains(results, 1)
        assertContains(results, 2)
        assertContains(results, 3)
    }
}