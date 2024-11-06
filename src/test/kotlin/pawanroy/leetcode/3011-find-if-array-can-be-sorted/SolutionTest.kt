package pawanroy.leetcode.`3011-find-if-array-can-be-sorted`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.canSortArray(intArrayOf(8, 4, 2, 30, 15)))
    }

    @Test
    fun caseTwo() {
        assertTrue(sol.canSortArray(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun caseThree() {
        assertFalse(sol.canSortArray(intArrayOf(3,16,8,4,2)))
    }
}