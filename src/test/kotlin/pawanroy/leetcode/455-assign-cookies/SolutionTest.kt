package pawanroy.leetcode.`455-assign-cookies`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(1, sol.findContentChildren(intArrayOf(1, 2, 3), intArrayOf(1, 1)))
        assertEquals(2, sol.findContentChildren(intArrayOf(1, 2), intArrayOf(1, 2, 3)))
    }

    @Test
    fun caseTwo() {
        assertEquals(2, sol.findContentChildren(intArrayOf(7, 8, 9, 10), intArrayOf(5, 6, 7, 8)))
        assertEquals(2, sol.findContentChildren(intArrayOf(10, 9, 8, 7), intArrayOf(5, 6, 7, 8)))
    }
}