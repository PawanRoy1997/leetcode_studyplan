package pawanroy.leetcode.median_of_two_sorted_array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    val solution = Solution()

    @Test
    fun caseOne() {
        val result = solution.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))
        assertEquals(2.0, result)
    }
    @Test
    fun caseTwo() {
        val result = solution.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3,4))
        assertEquals(2.5, result)
    }
    @Test
    fun caseThree() {
        val result = solution.findMedianSortedArrays(intArrayOf(-5,3,6,12,15), intArrayOf(-12,-10,-6,-3,4,10))
        assertEquals(3.0, result)
    }
}