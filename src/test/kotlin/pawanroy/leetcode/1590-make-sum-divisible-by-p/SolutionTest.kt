package pawanroy.leetcode.`1590-make-sum-divisible-by-p`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(1, sol.minSubarray(intArrayOf(3,1,4,2), 6))
    }
}