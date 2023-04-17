package pawanroy.leetcode.`1431-kids-wtih-the-greatest-number-of-candies`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val candies = intArrayOf(2, 3, 5, 1, 3)
        val extra = 3
        val expected = listOf(true, true, true, false, true)
        val output = sol.kidsWithCandies(candies, extra)
        for (i in expected.indices) assertEquals(expected[i], output[i])
    }

    @Test
    fun caseTwo() {
        val candies = intArrayOf(12, 1, 12)
        val extra = 10
        val expected = listOf(true, false, true)
        val output = sol.kidsWithCandies(candies, extra)
        for (i in candies.indices) assertEquals(expected[i], output[i])
    }
}