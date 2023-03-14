package pawanroy.leetcode.`121-best-time-to-buy-and-sell-stocks`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    @Test
    fun testCaseOne(){
        val input = intArrayOf(7,1,5,3,6,4)
        val result = Solution().maxProfit(input)
        assertEquals(5, result)
    }

    @Test
    fun testCaseTwo(){
        val input = intArrayOf(7,6,4,3,1)
        val result = Solution().maxProfit(input)
        assertEquals(0, result)
    }
}