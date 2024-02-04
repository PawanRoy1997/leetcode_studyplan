package pawanroy.leetcode.`1034-partition-array-for-maximum-sum`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        val arr = intArrayOf(1,15,7,9,2,5,10)
        assertEquals(84, sol.maxSumAfterPartitioning(arr,3))
    }

    @Test
    fun caseTwo(){
        val arr = intArrayOf(1,4,1,5,7,3,6,1,9,9,3)
        assertEquals(83, sol.maxSumAfterPartitioning(arr,4))
    }
}