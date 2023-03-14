package pawanroy.leetcode.`1539-Kth-missing-positive-number`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals(9, sol.findKthPositive(intArrayOf(2,3,4,7,11),5))
    }
    @Test
    fun caseTwo(){
        assertEquals(9, sol.findKthPositive(intArrayOf(1,2,3,4),5))
    }
}