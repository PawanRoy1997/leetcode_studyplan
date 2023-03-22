package pawanroy.leetcode.`2492-minimum-score-of-a-path-between-two-cities`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(2, sol.minScore(4, arrayOf(intArrayOf(1, 2, 2), intArrayOf(1, 3, 4), intArrayOf(3, 4, 7))))
    }

    @Test
    fun caseTwo() {
        assertEquals(
            5,
            sol.minScore(4, arrayOf(intArrayOf(1, 2, 9), intArrayOf(2, 3, 6), intArrayOf(2, 4, 5), intArrayOf(1, 4, 7)))
        )
    }

    @Test
    fun caseThree() {
        assertEquals(
            1885, sol.minScore(
                6, arrayOf(
                    intArrayOf(4, 5, 7468),
                    intArrayOf(6, 2, 7173),
                    intArrayOf(6, 3, 8365),
                    intArrayOf(2, 3, 7674),
                    intArrayOf(5, 6, 7852),
                    intArrayOf(1, 2, 8547),
                    intArrayOf(2, 4, 1885),
                    intArrayOf(2, 5, 5192),
                    intArrayOf(1, 3, 4065),
                    intArrayOf(1, 4, 7357)
                )
            )
        )
    }
}