package pawanroy.leetcode.`896-monotonic-array`

import kotlin.test.Test
import kotlin.test.assertFalse

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assert(sol.isMonotonic(intArrayOf(1,2,2,3,3,4,4)))
        assert(sol.isMonotonic(intArrayOf(1,1,1,1,1,1,1,1)))
        assert(sol.isMonotonic(intArrayOf(4,4,3,3,2,2,1,1)))
    }

    @Test
    fun caseTwo(){
        assertFalse(sol.isMonotonic(intArrayOf(1,2,2,4,3,3,4,4)))
    }
}