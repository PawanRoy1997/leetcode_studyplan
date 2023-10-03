package pawanroy.leetcode.`1512-number-of-good-pair`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals(4, sol.numIdenticalPairs(intArrayOf(1,2,3,1,1,3)))
    }
    @Test
    fun caseTwo(){
        assertEquals(0, sol.numIdenticalPairs(intArrayOf(1,2,3)))
    }
}