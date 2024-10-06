package pawanroy.leetcode.`1331-rank-transform-of-an-array`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val actual = sol.arrayRankTransform(intArrayOf(40, 10, 20, 30))
        assertArrayEquals(intArrayOf(4, 1, 2, 3), actual)
    }

    @Test
    fun caseTwo() {
        val actual = sol.arrayRankTransform(intArrayOf(10, 10, 10))
        assertArrayEquals(intArrayOf(1,1,1), actual)
    }


    @Test
    fun caseThree() {
        val actual = sol.arrayRankTransform(intArrayOf(37,12,28,9,100,56,80,5,12))
        assertArrayEquals(intArrayOf(5,3,4,2,8,6,7,1,3), actual)
    }
    fun assertArrayEquals(expected: IntArray, actual: IntArray) {
        assertEquals(expected.size, actual.size)
        if (expected.size == actual.size) {
            expected.forEachIndexed { index, i ->
                assertEquals(i, actual[index])
            }
        }
    }
}