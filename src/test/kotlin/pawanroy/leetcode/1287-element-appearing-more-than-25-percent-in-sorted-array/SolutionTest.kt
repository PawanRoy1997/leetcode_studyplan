package pawanroy.leetcode.`1287-element-appearing-more-than-25-percent-in-sorted-array`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(6, sol.findSpecialInteger(intArrayOf(1,2,2,6,6,6,6,7,10)))
    }
}