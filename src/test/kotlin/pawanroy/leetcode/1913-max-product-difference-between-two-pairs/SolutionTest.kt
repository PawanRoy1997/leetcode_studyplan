package pawanroy.leetcode.`1913-max-product-difference-between-two-pairs`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(34, sol.maxProductDifference(intArrayOf(5, 6, 2, 7, 4)))
    }

    @Test
    fun caseTwo(){
        assertEquals(64, sol.maxProductDifference(intArrayOf(4,2,5,9,7,4,8)))
    }
}