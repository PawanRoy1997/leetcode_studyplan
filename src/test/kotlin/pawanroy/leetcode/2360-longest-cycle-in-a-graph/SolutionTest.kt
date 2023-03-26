package pawanroy.leetcode.`2360-longest-cycle-in-a-graph`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(3, sol.longestCycle(intArrayOf(3, 3, 4, 2, 3)))
    }

    @Test
    fun caseTwo() {
        assertEquals(-1, sol.longestCycle(intArrayOf(2, -1, 3, 1)))
    }

    @Test
    fun caseThree() {
        assertEquals(3, sol.longestCycle(intArrayOf(3, 4, 0, 2, -1, 2)))
    }

    @Test
    fun caseFour() {
        assertEquals(3, sol.longestCycle(intArrayOf(5, 8, -1, 5, -1, 6, 1, 6, 6, 5)))
    }
}