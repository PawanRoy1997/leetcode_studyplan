package pawanroy.leetcode.`2348-number-of-zero-filled-subarrays`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(6L, sol.zeroFilledSubarray(intArrayOf(1,3,0,0,2,0,0,4)), "LeetCode case - 1")
    }

    @Test
    fun caseTwo() {
        assertEquals(9L, sol.zeroFilledSubarray(intArrayOf(0,0,0,2,0,0)), "LeetCode case - 2")
    }

    @Test
    fun caseThree() {
        assertEquals(0L, sol.zeroFilledSubarray(intArrayOf(1,2,3,4,5,6,7,8,9)), "LeetCode case - 2")
    }

    @Test
    fun caseFour() {
        assertEquals(15L, sol.zeroFilledSubarray(intArrayOf(0,0,0,0,0)), "LeetCode case - All Zero")
    }
}