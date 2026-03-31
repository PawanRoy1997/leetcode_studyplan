package pawanroy.leetcode.`2573-find-string-with-lcp`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun caseOne() {
        val expected = "abab"
        val result = solution.findTheString(
            arrayOf(
                intArrayOf(4, 0, 2, 0), intArrayOf(0, 3, 0, 1), intArrayOf(2, 0, 2, 0), intArrayOf(0, 1, 0, 1)
            )
        )
        assertEquals(expected, result)
    }

    @Test
    fun caseTwo() {
        val expected = "aaaa"
        val result = solution.findTheString(
            arrayOf(
                intArrayOf(4, 3, 2, 1),
                intArrayOf(3, 3, 2, 1),
                intArrayOf(2, 2, 2, 1),
                intArrayOf(1, 1, 1, 1)
            )
        )
        assertEquals(expected, result)
    }

    @Test
    fun caseThree() {
        val expected = ""
        val result = solution.findTheString(
            arrayOf(
                intArrayOf(4, 1, 1, 1),
                intArrayOf(1, 3, 1, 1),
                intArrayOf(1, 1, 2, 1),
                intArrayOf(1, 1, 1, 1)
            )
        )
        assertEquals(expected, result)
    }
}