package pawanroy.leetcode.binary_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    @Test
    fun testLastNumber(){
        val intRange = intArrayOf(1,2,3,4,5,6,7,8)
        val target = 8
        assertEquals(7, Solution().search(intRange, target))
    }

    @Test
    fun testFirstNumber(){
        val intRange = intArrayOf(1,2,3,4,5,6,7,8)
        val target = 1
        assertEquals(0, Solution().search(intRange, target))
    }
}