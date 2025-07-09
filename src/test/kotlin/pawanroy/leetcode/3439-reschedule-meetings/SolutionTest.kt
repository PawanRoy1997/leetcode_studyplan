package pawanroy.leetcode.`3439-reschedule-meetings`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(2, sol.maxFreeTime(5,1,intArrayOf(1,3), intArrayOf(2,5)))
    }

    @Test
    fun caseTwo() {
        assertEquals(6, sol.maxFreeTime(10,1,intArrayOf(0,2,9), intArrayOf(1,4,10)))
    }
}