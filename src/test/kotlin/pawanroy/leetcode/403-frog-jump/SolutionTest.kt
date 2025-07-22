package pawanroy.leetcode.`403-frog-jump`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    @Test
    fun caseOne(){
        assertTrue { Solution().canCross(intArrayOf(0,1,3,5,6,8,12,17)) }
    }

    @Test
    fun caseTwo(){
        assertFalse(Solution().canCross(intArrayOf(0,1,2,3,4,8,9,11)))
    }
}