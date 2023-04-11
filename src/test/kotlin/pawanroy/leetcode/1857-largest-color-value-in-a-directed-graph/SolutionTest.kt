package pawanroy.leetcode.`1857-largest-color-value-in-a-directed-graph`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(3, 4))
        assertEquals(3, sol.largestPathValue("abaca", edges))
    }

    @Test
    fun caseTwo() {
        val edges = arrayOf(intArrayOf(0, 0))
        assertEquals(-1, sol.largestPathValue("a", edges))
    }
}