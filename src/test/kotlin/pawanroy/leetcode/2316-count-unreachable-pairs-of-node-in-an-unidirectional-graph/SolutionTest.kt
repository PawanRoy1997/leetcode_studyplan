package pawanroy.leetcode.`2316-count-unreachable-pairs-of-node-in-an-unidirectional-graph`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2))
        assertEquals(0, sol.countPairs(3, edges))
    }

    @Test
    fun caseTwo() {
        val edges = arrayOf(intArrayOf(0, 2), intArrayOf(0, 5), intArrayOf(2, 4), intArrayOf(1, 6), intArrayOf(5, 4))
        assertEquals(14, sol.countPairs(7, edges))
    }

    @Test
    fun caseThree() {
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2))
        assertEquals(0, sol.countPairs(1, edges))
    }
}