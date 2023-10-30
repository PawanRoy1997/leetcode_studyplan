package pawanroy.leetcode.`29-divide-two-numbers`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseThree(){
        assertEquals(3, sol.divide(10,3))
    }
    @Test
    fun caseNegThree(){
        assertEquals(-3, sol.divide(10,-3))
    }

    @Test
    fun caseMaxValue(){
        assertEquals(Int.MAX_VALUE, sol.divide(Int.MIN_VALUE, -1))
    }

    @Test
    fun caseMaxNegative(){
        assertEquals(Int.MIN_VALUE, sol.divide(Int.MIN_VALUE, 1))
    }

    @Test
    fun caseUnique(){
        assertEquals(0, sol.divide(1038925803, -2147483648))
    }
}