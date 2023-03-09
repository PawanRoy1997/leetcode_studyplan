package pawanroy.leetcode.sort_an_array

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne() {
        assertArrayEquals(intArrayOf(1,2,3,4,5), sol.sortArray(intArrayOf(5,2,3,4,1)))
    }
}