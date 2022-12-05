package pawanroy.leetcode.find_pivot_index

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testCaseOne() {
        val pivotIndex = Solution().pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
        assertEquals(3, pivotIndex)
    }

    @Test
    fun testCaseTwo() {
        val pivotIndex = Solution().pivotIndex(intArrayOf(1,2,3))
        assertEquals(-1, pivotIndex)
    }

    @Test
    fun testCaseThree() {
        val pivotIndex = Solution().pivotIndex(intArrayOf(-1,-1,-1,-1,-1,-1))
        assertEquals(-1, pivotIndex)
    }
}