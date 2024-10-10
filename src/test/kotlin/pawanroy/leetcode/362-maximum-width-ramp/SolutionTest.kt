package pawanroy.leetcode.`362-maximum-width-ramp`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(4, sol.maxWidthRamp(intArrayOf(6,0,8,2,1,5)))
    }

    @Test
    fun caseTwo(){
        assertEquals(7, sol.maxWidthRamp(intArrayOf(9,8,1,0,1,9,4,0,4,1)))
    }
}