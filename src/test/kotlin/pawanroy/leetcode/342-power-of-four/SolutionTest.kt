package pawanroy.leetcode.`342-power-of-four`

import org.junit.jupiter.api.Assertions.assertFalse
import kotlin.test.Test
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertTrue (sol.isPowerOfFour(4))
    }

    @Test
    fun caseTwo(){
        assertFalse (sol.isPowerOfFour(5))
    }
}