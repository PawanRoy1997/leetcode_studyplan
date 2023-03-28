package pawanroy.leetcode.`983-minimum-cost-for-tickets`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val days = intArrayOf(1, 4, 6, 7, 8, 20)
        val costs = intArrayOf(2, 7, 15)
        assertEquals(11, sol.mincostTickets(days, costs))
    }

    @Test
    fun caseTwo() {
        val days = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31)
        val costs = intArrayOf(2, 7, 15)
        assertEquals(17, sol.mincostTickets(days, costs))
    }

    @Test
    fun caseThree() {
        val days = intArrayOf(1, 4, 6, 7, 8, 20)
        val costs = intArrayOf(7, 2, 15)
        assertEquals(6, sol.mincostTickets(days, costs))
    }
}
