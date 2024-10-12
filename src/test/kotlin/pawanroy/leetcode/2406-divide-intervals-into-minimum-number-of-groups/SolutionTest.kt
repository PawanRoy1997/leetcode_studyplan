package pawanroy.leetcode.`2406-divide-intervals-into-minimum-number-of-groups`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(
            1,
            sol.minGroups(arrayOf(intArrayOf(1, 3), intArrayOf(5, 6), intArrayOf(8, 10), intArrayOf(11, 13)))
        )
    }

    @Test
    fun caseTwo() {
        assertEquals(
            3, sol.minGroups(
                arrayOf(
                    intArrayOf(5, 10),
                    intArrayOf(6, 8),
                    intArrayOf(1, 5),
                    intArrayOf(2, 3),
                    intArrayOf(1, 10)
                )
            )
        )
    }
}