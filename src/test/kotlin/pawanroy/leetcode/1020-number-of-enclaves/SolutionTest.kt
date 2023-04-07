package pawanroy.leetcode.`1020-number-of-enclaves`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val grid =
            arrayOf(intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 1, 0), intArrayOf(0, 0, 1, 0), intArrayOf(0, 0, 0, 0))
        assertEquals(0, sol.numEnclaves(grid))
    }

    @Test
    fun caseTwo() {
        val grid =
            arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(1, 0, 1, 0), intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 0, 0))
        assertEquals(3, sol.numEnclaves(grid))
    }
}