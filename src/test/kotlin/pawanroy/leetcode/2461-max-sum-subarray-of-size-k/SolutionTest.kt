package pawanroy.leetcode.`2461-max-sum-subarray-of-size-k`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(15, sol.maximumSubarraySum(intArrayOf(1,3,4,2,9,9,9), 3))
    }
}