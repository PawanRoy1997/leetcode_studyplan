package pawanroy.leetcode.`1291-sequential-digits`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val expected = listOf(123, 234)
        val actual = sol.sequentialDigits(100, 300)
        checkResult(expected, actual)
    }

    @Test
    fun caseTwo() {
        val expected = listOf(1234, 2345, 3456, 4567, 5678, 6789, 12345)
        val actual = sol.sequentialDigits(1000, 13000)
        checkResult(expected, actual)
    }

    private fun checkResult(expected: List<Int>, actual: List<Int>) {
        assertEquals(expected.size, actual.size)
        for (index in expected.indices) assertEquals(expected[index], actual[index])
    }
}