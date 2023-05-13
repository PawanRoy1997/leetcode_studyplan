package pawanroy.leetcode.`54-spiral-matrix`

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val input = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val output = listOf(1, 2, 3, 6, 9, 8, 7, 4, 5)
        val actual = sol.spiralOrder(input)
        print(actual)
        assertContentEquals(output, actual)
    }

    @Test
    fun caseTwo() {
        val input = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
        val expected = listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
        val output = sol.spiralOrder(input)
        print(output)
        assertContentEquals(expected, output)
    }

    @Test
    fun caseThree() {
        val input =
            arrayOf(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), intArrayOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20))
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11)
        assertContentEquals(expected, sol.spiralOrder(input))
    }
}