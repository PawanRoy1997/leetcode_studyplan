package pawanroy.leetcode.`75-sort-colors`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()
    @Test
    fun name() {
        val intArray = intArrayOf(2,0,2,1,1,0)
        sol.sortColors(intArray)
        assertArrayEquals(intArrayOf(0,0,1,1,2,2), intArray)
    }
}