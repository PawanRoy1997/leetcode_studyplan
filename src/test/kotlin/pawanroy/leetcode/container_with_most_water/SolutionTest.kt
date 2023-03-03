package pawanroy.leetcode.container_with_most_water

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun caseOne() {
        assertEquals(1, solution.maxArea(intArrayOf(1, 1)))
    }

    @Test
    fun caseZero() {
        assertEquals(0, solution.maxArea(intArrayOf(1)))
    }

    @Test
    fun caseUnEqual() {
        assertEquals(1, solution.maxArea(intArrayOf(1, 2)))
    }

    @Test
    fun complexCaseOne() {
        assertEquals(49, solution.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    }

    @Test
    fun complexCaseTwo() {
        assertEquals(17, solution.maxArea(intArrayOf(2,3,4,5,18,17,6)))
    }
}