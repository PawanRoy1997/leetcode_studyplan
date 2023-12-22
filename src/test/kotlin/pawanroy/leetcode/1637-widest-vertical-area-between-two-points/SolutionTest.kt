package pawanroy.leetcode.`1637-widest-vertical-area-between-two-points`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        val input = arrayOf(intArrayOf(8,7), intArrayOf(9,9), intArrayOf(7,4), intArrayOf(9,7))
        assertEquals(1, sol.maxWidthOfVerticalArea(input))
    }

   @Test
    fun caseTwo(){
        val input = arrayOf(intArrayOf(3,1),intArrayOf(9,0),intArrayOf(1,0),intArrayOf(1,4),intArrayOf(5,3),intArrayOf(8,8))
        assertEquals(3, sol.maxWidthOfVerticalArea(input))
    }
}