package pawanroy.leetcode.`53-maximum-subarray`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(6, sol.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun caseTwo() {
        assertEquals(1, sol.maxSubArray(intArrayOf(1)))
    }

    @Test
    fun caseThree() {
        assertEquals(23, sol.maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
    }

    @Test
    fun caseFour() {
        assertEquals(4, sol.maxSubArray(intArrayOf(-1, 3, -2, -2, 2, 2, -5)))
    }

    @Test
    fun caseFive() {
        assertEquals(-1, sol.maxSubArray(intArrayOf(-1, -2, -3, -4)))
    }
}