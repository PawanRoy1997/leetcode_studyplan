package pawanroy.leetcode.`1353-maximum-number-of-events-that-can-be-attended`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(3, sol.maxEvents(arrayOf(intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 2))))
        assertEquals(4, sol.maxEvents(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 2))))
    }
}