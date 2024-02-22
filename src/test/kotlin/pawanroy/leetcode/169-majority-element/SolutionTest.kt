package pawanroy.leetcode.`169-majority-element`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(3, sol.majorityElement(intArrayOf(3, 3, 4)))
    }

    @Test
    fun caseTwo() {
        assertEquals(3, sol.majorityElement(intArrayOf(3, 2, 3)))
    }

    @Test
    fun caseThree() {
        assertEquals(2, sol.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    }
}