package pawanroy.leetcode.`1254-numbre-of-close-islands`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val grid = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0, 1, 1, 0),
            intArrayOf(1, 0, 1, 0, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0, 1, 0, 1),
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 0)
        )
        assertEquals(2, sol.closedIsland(grid))
    }

    @Test
    fun caseTwo() {
        val grid = arrayOf(intArrayOf(0, 0, 1, 0, 0), intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 1, 1, 1, 0))
        assertEquals(1, sol.closedIsland(grid))
    }

    @Test
    fun caseThree() {
        val grid = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1),
            intArrayOf(1, 0, 0, 0, 0, 0, 1),
            intArrayOf(1, 0, 1, 1, 1, 0, 1),
            intArrayOf(1, 0, 1, 0, 1, 0, 1),
            intArrayOf(1, 0, 1, 1, 1, 0, 1),
            intArrayOf(1, 0, 0, 0, 0, 0, 1),
            intArrayOf(1, 1, 1, 1, 1, 1, 1)
        )
        assertEquals(2, sol.closedIsland(grid))
    }
}