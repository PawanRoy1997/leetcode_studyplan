package pawanroy.leetcode.`3474-lexographically-smallest-generated-string`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `example 01`() {
        assert(solution.generateString("TTFT", "fff").isEmpty())
    }

    @Test
    fun `example 02`() {
        assertEquals("ababa", solution.generateString("TFTF", "ab"))
    }
}