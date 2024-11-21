package pawanroy.leetcode.`2257-unguarded-cells`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(
            7, sol.countUnguarded(
                4,
                6,
                arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(2, 3)),
                arrayOf(intArrayOf(0, 1), intArrayOf(2, 2), intArrayOf(1, 4))
            )
        )
    }

    @Test
    fun caseTwo() {
        assertEquals(
            1, sol.countUnguarded(
                2,
                7,
                arrayOf(intArrayOf(1,5), intArrayOf(1,1), intArrayOf(1,6), intArrayOf(0,2)),
                arrayOf(intArrayOf(0,6), intArrayOf(0,3), intArrayOf(0,5))
            )
        )
    }
}