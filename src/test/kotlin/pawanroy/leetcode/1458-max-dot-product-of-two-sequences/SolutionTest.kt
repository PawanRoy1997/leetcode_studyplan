package pawanroy.leetcode.`1458-max-dot-product-of-two-sequences`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(18, sol.maxDotProduct(intArrayOf(2,1,-2,5), intArrayOf(3,0,-6)))
    }
}