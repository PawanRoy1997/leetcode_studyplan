package pawanroy.leetcode.`867-transpose-matrix`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val expected = arrayOf(intArrayOf(1, 4, 7), intArrayOf(2, 5, 8), intArrayOf(3, 6, 9))
        assertMatrixEquals(expected, sol.transpose(input))
    }

    @Test
    fun caseTwo() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
        val expected = arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 6))
        assertMatrixEquals(expected, sol.transpose(input))
    }

    private fun assertMatrixEquals(expected: Array<IntArray>, actual: Array<IntArray>) {
        assertEquals(expected.size, actual.size)
        assertEquals(expected.first().size, actual.first().size)
        for (row in expected.indices) for (col in expected.first().indices)
            assertEquals(expected[row][col], actual[row][col])
    }
}