package pawanroy.leetcode.`1792-max-avg-pass-ratio`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(
            0.7833333333333333,
            sol.maxAverageRatio(
                classes = arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(2, 2)),
                extraStudents = 2
            )
        )
    }

    @Test
    fun caseTwo() {
        assertEquals(
            0.5348484848484849,
            sol.maxAverageRatio(
                classes = arrayOf(intArrayOf(2, 4), intArrayOf(3, 9), intArrayOf(4, 5), intArrayOf(2, 10)),
                extraStudents = 4
            )
        )
    }
}