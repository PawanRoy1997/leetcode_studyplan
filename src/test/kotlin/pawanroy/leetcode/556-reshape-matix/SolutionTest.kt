package pawanroy.leetcode.`556-reshape-matix`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val mat = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        assertArrayEquals(arrayOf(intArrayOf(1, 2, 3, 4)), sol.matrixReshape(mat, 1, 4))
    }

    @Test
    fun caseTwo() {
        val mat = arrayOf(intArrayOf(1, 2, 3, 4))
        assertArrayEquals(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), sol.matrixReshape(mat, 2, 2))
    }
}