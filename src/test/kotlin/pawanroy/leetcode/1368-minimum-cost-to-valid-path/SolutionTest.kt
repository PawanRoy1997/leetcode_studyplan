package pawanroy.leetcode.`1368-minimum-cost-to-valid-path`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(
            3,
            sol.minCost(
                arrayOf(
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(2, 2, 2, 2),
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(2, 2, 2, 2)
                )
            )
        )
    }

    @Test
    fun caseTwo() {
        assertEquals(0, sol.minCost(arrayOf(intArrayOf(1, 1, 3), intArrayOf(3, 2, 2), intArrayOf(1, 1, 4))))
    }

    @Test
    fun caseThree() {
        assertEquals(1, sol.minCost(arrayOf(intArrayOf(1, 2), intArrayOf(4, 3))))
    }
}