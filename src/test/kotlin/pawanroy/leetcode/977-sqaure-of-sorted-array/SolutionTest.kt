package pawanroy.leetcode.`977-sqaure-of-sorted-array`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), sol.sortedSquares(intArrayOf(-4, -1, 0, 3, 10)))
    }

    @Test
    fun caseTwo() {
        assertArrayEquals(intArrayOf(4, 9, 9, 49, 121), sol.sortedSquares(intArrayOf(-7, -3, 2, 3, 11)))
    }
}