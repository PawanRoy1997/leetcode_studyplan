package pawanroy.leetcode.`946-validate-stack-sequences`

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(5, 4, 3, 2, 1)))
    }

    @Test
    fun caseTwo() {
        assertTrue(sol.validateStackSequences(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3)))
    }

    @Test
    fun caseThree() {
        assertFalse(sol.validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 3, 5, 1, 2)))
    }
}