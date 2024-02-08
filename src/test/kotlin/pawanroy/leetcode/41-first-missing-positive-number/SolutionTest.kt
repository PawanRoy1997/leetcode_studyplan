package pawanroy.leetcode.`41-first-missing-positive-number`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(1, sol.firstMissingPositive(intArrayOf(7,8,9,11,12)))
    }

    @Test
    fun caseTwo(){
        assertEquals(2, sol.firstMissingPositive(intArrayOf(3,4,-1,1)))
    }

    @Test
    fun caseThree(){
        assertEquals(3, sol.firstMissingPositive(intArrayOf(1,2,0)))
    }
}