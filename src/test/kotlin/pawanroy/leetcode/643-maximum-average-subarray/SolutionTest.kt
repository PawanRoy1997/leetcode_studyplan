package pawanroy.leetcode.`643-maximum-average-subarray`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun caseOne(){
        assertEquals(12.75, Solution().findMaxAverage(intArrayOf(1,12,-5,-6,50,3), 4))
    }

    @Test
    fun caseTwo(){
        assertEquals(3.3333333333333335, Solution().findMaxAverage(intArrayOf(3,3,4,3,0),3))
    }

    @Test
    fun caseThree(){
        assertEquals(2.0, Solution().findMaxAverage(intArrayOf(0,1,1,3,3),4))
    }
}