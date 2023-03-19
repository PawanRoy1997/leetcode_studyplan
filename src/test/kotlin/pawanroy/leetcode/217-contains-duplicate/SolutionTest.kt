package pawanroy.leetcode.`217-contains-duplicate`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.containsDuplicate(intArrayOf(1, 2, 3, 4, 1)))
    }

    @Test
    fun caseTwo() {
        assertFalse(sol.containsDuplicate(intArrayOf(1)))
    }

    @Test
    fun caseThree() {
        assertFalse(sol.containsDuplicate(intArrayOf(1, 2)))
    }

    @Test
    fun caseFour() {
        assertTrue(sol.containsDuplicate(intArrayOf(1, 1, 2)))
    }

    @Test
    fun caseFive() {
        assertTrue(sol.containsDuplicate(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11)))
    }
}