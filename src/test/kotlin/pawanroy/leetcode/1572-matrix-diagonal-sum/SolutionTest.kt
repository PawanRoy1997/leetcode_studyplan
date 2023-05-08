package pawanroy.leetcode.`1572-matrix-diagonal-sum`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        assertEquals(25, sol.diagonalSum(input))
    }

    @Test
    fun caseTwo() {
        val input =
            arrayOf(intArrayOf(1, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(1, 1, 1, 1))
        assertEquals(8, sol.diagonalSum(input))
    }

    @Test
    fun caseThree() {
        val input = arrayOf(intArrayOf(5))
        assertEquals(5, sol.diagonalSum(input))
    }
}