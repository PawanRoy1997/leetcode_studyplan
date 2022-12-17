package pawanroy.leetcode.number_of_islands

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testCaseOne() {
        val grid = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1')
        )

        assertEquals(3, Solution().numIslands(grid))
    }

    @Test
    fun testCaseTwo() {
        val grid = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('0', '0', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0')
        )

        assertEquals(1, Solution().numIslands(grid))
    }

    @Test
    fun testCaseThree(){
        val grid = arrayOf(
            charArrayOf('1','1','1'),
            charArrayOf('0','1','0'),
            charArrayOf('1','1','1')
        )
        assertEquals(1, Solution().numIslands(grid))
    }
}