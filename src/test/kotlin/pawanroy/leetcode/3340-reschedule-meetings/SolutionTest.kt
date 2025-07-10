package pawanroy.leetcode.`3340-reschedule-meetings`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(2, sol.maxFreeTime(5, intArrayOf(1, 3), intArrayOf(2, 5)))
    }

    @Test
    fun caseTwo() {
        assertEquals(7, sol.maxFreeTime(10, intArrayOf(0, 7, 9), intArrayOf(1, 8, 10)))
    }
}