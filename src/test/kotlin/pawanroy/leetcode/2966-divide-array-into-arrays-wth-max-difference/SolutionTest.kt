package pawanroy.leetcode.`2966-divide-array-into-arrays-wth-max-difference`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val input = intArrayOf(1, 3, 4, 8, 7, 9, 3, 5, 1)
        val expected = arrayOf(intArrayOf(1, 1, 3), intArrayOf(3, 4, 5), intArrayOf(7, 8, 9))
        assertResultEquals(expected, sol.divideArray(input, 3))
    }

    private fun assertResultEquals(expected: Array<IntArray>, actual: Array<IntArray>) {
        assertEquals(expected.size, actual.size)

        for (arrayIndex in expected.indices) {
            for (itemIndex in 0..2) {
                assertEquals(expected[arrayIndex][itemIndex], actual[arrayIndex][itemIndex])
            }
        }
    }
}