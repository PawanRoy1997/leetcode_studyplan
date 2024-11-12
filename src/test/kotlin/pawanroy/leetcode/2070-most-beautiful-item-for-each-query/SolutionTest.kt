package pawanroy.leetcode.`2070-most-beautiful-item-for-each-query`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertListEquals(
            intArrayOf(2, 4, 5, 5, 6, 6),
            sol.maximumBeauty(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(3, 2),
                    intArrayOf(2, 4),
                    intArrayOf(5, 6),
                    intArrayOf(3, 5)
                ), intArrayOf(1, 2, 3, 4, 5, 6)
            )
        )
    }

    private fun assertListEquals(expected: IntArray, actual: IntArray) {
        assertEquals(expected.size, actual.size)
        expected.forEachIndexed { index, i ->
            assertEquals(i, actual[index])
        }
    }
}