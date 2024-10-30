package pawanroy.leetcode.`2501-longest-square-streak-in-an-array`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(3, sol.longestSquareStreak(intArrayOf(4,3,6,16,8,2)))
    }
}