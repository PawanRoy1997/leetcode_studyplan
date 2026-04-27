package pawanroy.leetcode.`45-jump-game`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun caseOne() {
        assertEquals(2, solution.jump(intArrayOf(2, 3, 1, 1, 4)))
    }
}