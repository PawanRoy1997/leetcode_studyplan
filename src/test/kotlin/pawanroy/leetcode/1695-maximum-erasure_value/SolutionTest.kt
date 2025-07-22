package pawanroy.leetcode.`1695-maximum-erasure_value`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(17, sol.maximumUniqueSubarray(intArrayOf(4,2,4,5,6)))
    }

    @Test
    fun caseTwo(){
        assertEquals(8, sol.maximumUniqueSubarray(intArrayOf(5,2,1,2,5,2,1,2,5)))
    }

    @Test
    fun caseThree(){
        assertEquals(10001, sol.maximumUniqueSubarray(intArrayOf(10000,1,10000,1,1,1,1)))
    }
}