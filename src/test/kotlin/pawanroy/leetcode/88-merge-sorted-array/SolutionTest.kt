package pawanroy.leetcode.`88-merge-sorted-array`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val res = intArrayOf(1, 2, 3, 0, 0, 0)
        sol.merge(res, 3, intArrayOf(2, 5, 6), 3)
        assertArrayEquals(
            intArrayOf(1, 2, 2, 3, 5, 6),
            res
        )
    }

    @Test
    fun caseTwo() {
        val res = intArrayOf(0, 0, 0)
        sol.merge(res, 0, intArrayOf(2, 5, 6), 3)
        assertArrayEquals(
            intArrayOf(2, 5, 6),
            res
        )
    }

    @Test
    fun caseThree() {
        val res = intArrayOf(2, 5, 6)
        sol.merge(res, 3, intArrayOf(), 0)
        assertArrayEquals(
            intArrayOf(2, 5, 6),
            res
        )
    }
}