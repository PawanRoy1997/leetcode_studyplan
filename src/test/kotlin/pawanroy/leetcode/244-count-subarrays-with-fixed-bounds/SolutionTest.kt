package pawanroy.leetcode.`244-count-subarrays-with-fixed-bounds`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun caseOne() {
        assertEquals(4L, solution.countSubarrays(intArrayOf(1, 3, 5, 2, 7, 1, 3, 5, 2, 7, 5), 1, 5))
    }

    @Test
    fun caseTwo() {
        assertEquals(10, solution.countSubarrays(intArrayOf(1, 1, 1, 1), 1, 1))
    }
}