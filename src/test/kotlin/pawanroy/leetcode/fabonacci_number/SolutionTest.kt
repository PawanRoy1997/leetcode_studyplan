package pawanroy.leetcode.fabonacci_number

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{

    @Test
    fun testCaseZero(){
        assertEquals(0, Solution().fib(0))
    }

    @Test
    fun testCaseOne(){
        assertEquals(1, Solution().fib(1))
    }

    @Test
    fun testCaseTwo(){
        assertEquals(1, Solution().fib(2))
    }

    @Test
    fun testCaseThree(){
        assertEquals(2, Solution().fib(3))
    }
}