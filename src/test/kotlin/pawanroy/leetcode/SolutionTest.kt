package pawanroy.leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals(9, sol.findKthPositive(intArrayOf(2,3,4,7,11),5))
    }
}