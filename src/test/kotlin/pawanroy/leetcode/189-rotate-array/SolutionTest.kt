package pawanroy.leetcode.`189-rotate-array`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        sol.rotate(arr, 3)
        arr.forEach(::print)
        assertArrayEquals(intArrayOf(5, 6, 7, 1, 2, 3, 4), arr)
    }

    @Test
    fun caseTwo() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        sol.rotate(arr, 2)
        assertArrayEquals(intArrayOf(6, 7, 1, 2, 3, 4, 5), arr)
    }

    @Test
    fun caseThree() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        sol.rotate(arr, 1)
        arr.forEach { print("$it,") }
        assertArrayEquals(intArrayOf(7, 1, 2, 3, 4, 5, 6), arr)
    }

    @Test
    fun caseFour() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        sol.rotate(arr, 0)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7), arr)
        sol.rotate(arr, 7)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7), arr)
    }

    @Test
    fun caseFive() {
        val arr = intArrayOf(-1, -100, 3, 99)
        sol.rotate(arr, 2)
        arr.forEach(::print)
        assertArrayEquals(intArrayOf(3, 99, -1, -100), arr)
    }
}