package pawanroy.leetcode.`704-binary-search`

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

    @Test
    fun testNotInList(){
        val intRange = intArrayOf(1,2,3,4,5,6,7,8)
        val target = 10
        assertEquals(-1, Solution().search(intRange, target))
    }
}