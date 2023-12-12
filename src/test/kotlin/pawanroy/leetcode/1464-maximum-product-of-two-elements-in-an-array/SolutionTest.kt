package pawanroy.leetcode.`1464-maximum-product-of-two-elements-in-an-array`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(12, sol.maxProduct(intArrayOf(3, 4, 5, 2)))
    }

    @Test
    fun caseTwo() {
        assertEquals(16, sol.maxProduct(intArrayOf(1, 5, 4, 5)))
    }

    @Test
    fun caseThree(){
        assertEquals(36, sol.maxProduct(intArrayOf(10,2,5,2)))
    }
}