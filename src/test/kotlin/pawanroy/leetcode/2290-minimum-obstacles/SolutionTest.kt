package pawanroy.leetcode.`2290-minimum-obstacles`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(2, sol.minimumObstacles(arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))))
    }

    @Test
    fun caseTwo() {
        assertEquals(
            0, sol.minimumObstacles(
                arrayOf(
                    intArrayOf(0, 1, 0, 0, 0),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(0, 0, 0, 1, 0)
                )
            )
        )
    }

    @Test
    fun caseThree() {
        assertEquals(
            4, sol.minimumObstacles(
                arrayOf(
                    intArrayOf(0, 1, 1, 1, 1, 1, 0, 1),
                    intArrayOf(0, 1, 1, 1, 1, 1, 0, 1),
                    intArrayOf(1, 1, 1, 1, 0, 0, 0, 1),
                    intArrayOf(1, 1, 1, 1, 1, 1, 1, 1),
                    intArrayOf(0, 1, 1, 0, 0, 0, 0, 1),
                    intArrayOf(1, 1, 1, 1, 1, 1, 0, 0)
                )
            )
        )
    }
}