package pawanroy.leetcode.`70-climbing-stairs`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{

    @Test
    fun testCaseZero(){
        assertEquals(0, Solution().climbStairs(0))
    }

    @Test
    fun testCaseOne(){
        assertEquals(1, Solution().climbStairs(1))
    }

    @Test
    fun testCaseTwo(){
        assertEquals(2, Solution().climbStairs(2))
    }

    @Test
    fun testCaseThree(){
        assertEquals(3, Solution().climbStairs(3))
    }
}