package pawanroy.leetcode.`1266-minimum-time-visiting-all-points`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(7, sol.minTimeToVisitAllPoints(arrayOf(intArrayOf(1,1), intArrayOf(3,4), intArrayOf(-1,0))))
    }
}