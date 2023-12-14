package pawanroy.leetcode.`2482-difference-between-ones-and-zeros-in-row-and-column`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val input = arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 0, 1), intArrayOf(0, 0, 1))
        val expected = arrayOf(intArrayOf(0, 0, 4), intArrayOf(0, 0, 4), intArrayOf(-2, -2, 2))
        assertGridEquals(expected, sol.onesMinusZeros(input))
    }

    private fun assertGridEquals(expected: Array<IntArray>, actual: Array<IntArray>) {
        assertEquals(expected.size, actual.size)
        assertEquals(expected.first().size, actual.first().size)
        for (row in expected.indices) for (col in expected.first().indices) {
            assertEquals(expected[row][col], actual[row][col])
        }
    }
}