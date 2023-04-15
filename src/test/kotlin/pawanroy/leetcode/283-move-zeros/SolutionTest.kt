package pawanroy.leetcode.`283-move-zeros`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val input = intArrayOf(0, 1, 0, 3, 12)
        val expected = intArrayOf(1, 3, 12, 0, 0)
        sol.moveZeroes(input)
        assertArrayEquals(expected, input, "Case:1")
    }

    @Test
    fun caseTwo() {
        val input = intArrayOf(0)
        val expected = intArrayOf(0)
        sol.moveZeroes(input)
        assertArrayEquals(expected, input, "Case:2")
    }

    @Test
    fun caseThree() {
        val input = intArrayOf(1)
        val expected = intArrayOf(1)
        sol.moveZeroes(input)
        assertArrayEquals(expected, input, "Case:3")
    }
}