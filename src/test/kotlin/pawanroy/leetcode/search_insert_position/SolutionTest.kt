package pawanroy.leetcode.search_insert_position

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun caseNumberExists() {
        assertEquals(2, solution.searchInsert(intArrayOf(1, 3, 5, 6), 5))
    }

    @Test
    fun caseNumberExists1() {
        assertEquals(0, solution.searchInsert(intArrayOf(1, 3, 5, 6), 1))
    }

    @Test
    fun caseNumberNotExists() {
        assertEquals(1, solution.searchInsert(intArrayOf(1, 3, 5, 6), 2))
    }

    @Test
    fun caseNumberBigger() {
        assertEquals(4, solution.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    }

    @Test
    fun caseNumberSmaller() {
        assertEquals(0, solution.searchInsert(intArrayOf(1, 3, 5, 6), 0))
    }
}