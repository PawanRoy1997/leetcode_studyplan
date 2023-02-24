package pawanroy.leetcode.remove_element

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun caseOne() {
        val input = intArrayOf(3, 2, 2, 3)
        val expct = intArrayOf(2, 2, 2, 3)
        val result = solution.removeElement(input, 3)
        Assertions.assertArrayEquals(expct, input)
        Assertions.assertEquals(2,result)
    }
}