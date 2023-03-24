package pawanroy.leetcode.`74-search-a-2d-matrix`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val matrix = arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60))
        assertTrue(sol.searchMatrix(matrix, 3))
        assertFalse(sol.searchMatrix(matrix, 4))
    }

    @Test
    fun caseTwo() {
        val matrix = arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60))
        assertTrue(sol.searchMatrix(matrix, 10))
        assertFalse(sol.searchMatrix(matrix, 13))
    }

    @Test
    fun caseThree() {
        val matrix = arrayOf(intArrayOf(1), intArrayOf(3))
        assertTrue(sol.searchMatrix(matrix, 1))
    }
}