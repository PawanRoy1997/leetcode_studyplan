package pawanroy.leetcode.running_sum

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SolutionTest {
    @Test
    fun caseOne() {
        assertTrue(intArrayOf(1, 3, 6, 10).contentEquals(Solution().runningSum(intArrayOf(1, 2, 3, 4))))
    }
}