package pawanroy.leetcode.min_cost_climbing_stairs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    @Test
    fun testCaseOne(){
        val cost = intArrayOf(1,2)
        assertEquals(1, Solution().minCostClimbingStairs(cost))
    }

    @Test
    fun testCaseTwo(){
        val cost = intArrayOf(10,15,20)
        assertEquals(15, Solution().minCostClimbingStairs(cost))
    }
}