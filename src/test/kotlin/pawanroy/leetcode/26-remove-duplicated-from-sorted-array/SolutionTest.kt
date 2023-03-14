package pawanroy.leetcode.`26-remove-duplicated-from-sorted-array`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun caseOne() {
        val input = intArrayOf(1, 1, 2)
        val expected = intArrayOf(1, 2, 2)
        val result = solution.removeDuplicates(input)
        Assertions.assertEquals(2, result)
        Assertions.assertArrayEquals(expected, input)
    }

    @Test
    fun caseTwo() {
        val input = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val expct = intArrayOf(0, 1, 2, 3, 4, 2, 2, 3, 3, 4)
        val result = solution.removeDuplicates(input)
        Assertions.assertEquals(5, result)
        Assertions.assertArrayEquals(expct, input)
    }
}