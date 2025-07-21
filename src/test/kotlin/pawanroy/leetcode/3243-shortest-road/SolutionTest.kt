package pawanroy.leetcode.`3243-shortest-road`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val actual = sol.shortestDistanceAfterQueries(
            8,
            arrayOf(intArrayOf(0, 4), intArrayOf(3, 6), intArrayOf(2, 5), intArrayOf(0, 3))
        )

        val expected = intArrayOf(4, 4, 4, 3)
        for (i in expected.indices) {
            assertEquals(expected[i], actual[i])
        }
    }
}