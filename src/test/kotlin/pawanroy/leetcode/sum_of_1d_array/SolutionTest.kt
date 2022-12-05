package pawanroy.leetcode.sum_of_1d_array

import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testCaseOne() {
        val result = Solution().runningSum(intArrayOf(1, 2, 3, 4))
        assert(intArrayOf(1, 3, 6, 10).contentEquals(result))
    }

    @Test
    fun testCaseTwo() {
        val result = Solution().runningSum(intArrayOf(1, 1, 1, 1, 1))
        assert(intArrayOf(1, 2, 3, 4, 5).contentEquals(result))
    }
}