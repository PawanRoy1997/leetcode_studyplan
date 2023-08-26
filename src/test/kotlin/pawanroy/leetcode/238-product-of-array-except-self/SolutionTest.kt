package pawanroy.leetcode.`238-product-of-array-except-self`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun testCaseOne(){
        val expected = intArrayOf(24,12,8,6)
        val input = intArrayOf(1,2,3,4)
        val result = Solution().productExceptSelf(input)
        result.forEach(::print)
        assertArrayEquals(expected, result)
    }
}