package pawanroy.leetcode.`167-two-sum-2-input-array-is-sorted`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertArrayEquals(intArrayOf(1, 2), sol.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun caseTwo() {
        assertArrayEquals(intArrayOf(1, 3), sol.twoSum(intArrayOf(2, 3, 4), 6))
    }
}