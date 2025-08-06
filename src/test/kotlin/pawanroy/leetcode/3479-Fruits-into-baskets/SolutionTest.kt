package pawanroy.leetcode.`3479-Fruits-into-baskets`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(1, sol.numOfUnplacedFruits(intArrayOf(4, 2, 5), intArrayOf(3, 5, 4)))
    }

    @Test
    fun caseZero() {
        assertEquals(0, sol.numOfUnplacedFruits(intArrayOf(3, 6, 1), intArrayOf(6, 4, 7)))
    }
}