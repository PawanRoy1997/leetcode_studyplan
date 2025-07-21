package pawanroy.leetcode.`2097-valid-arrangement-of-pairs`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val expected = arrayOf(intArrayOf(11, 9), intArrayOf(9, 4), intArrayOf(4, 5), intArrayOf(5, 1))
        val actual =
            sol.validArrangement(arrayOf(intArrayOf(5, 1), intArrayOf(4, 5), intArrayOf(11, 9), intArrayOf(9, 4)))
        assertEquals(expected.size, actual.size, "Size mismatch")
        expected.forEachIndexed { index, arr ->
            assertEquals(arr[0], actual[index][0], "Value mismatch")
            assertEquals(arr[1], actual[index][1], "Value mismatch")
        }
    }

    @Test
    fun caseTwo() {
        val expected = arrayOf(intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(1, 3))
        val actual = sol.validArrangement(arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 1)))
        assertEquals(expected.size, actual.size, "Size mismatch")
        expected.forEachIndexed { index, arr ->
            assertEquals(arr[0], actual[index][0],"Value mismatch")
            assertEquals(arr[1], actual[index][1],"Value mismatch")
        }
    }

    @Test
    fun caseThree() {
        val expected = arrayOf(intArrayOf(1, 3), intArrayOf(3, 2), intArrayOf(2, 1))
        val actual = sol.validArrangement(arrayOf(intArrayOf(1, 3), intArrayOf(3, 2), intArrayOf(2, 1)))
        assertEquals(expected.size, actual.size, "Size mismatch")
        expected.forEachIndexed { index, arr ->
            assertEquals(arr[0], actual[index][0],"Value mismatch")
            assertEquals(arr[1], actual[index][1],"Value mismatch")
        }
    }
}