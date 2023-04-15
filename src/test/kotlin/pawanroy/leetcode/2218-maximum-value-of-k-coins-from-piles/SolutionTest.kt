package pawanroy.leetcode.`2218-maximum-value-of-k-coins-from-piles`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(101, sol.maxValueOfCoins(listOf(listOf(1, 100, 3), listOf(7, 8, 9)), 2))
    }

    @Test
    fun caseTwo() {
        assertEquals(
            706,
            sol.maxValueOfCoins(
                listOf(
                    listOf(100),
                    listOf(100),
                    listOf(100),
                    listOf(100),
                    listOf(100),
                    listOf(100),
                    listOf(1, 1, 1, 1, 1, 1, 700)
                ),
                7
            )
        )
    }
}