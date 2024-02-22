package pawanroy.leetcode.`997-find-the-town-judge`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(2, sol.findJudge(2, arrayOf(intArrayOf(1,2))))
    }

    @Test
    fun caseTwo(){
        assertEquals(3, sol.findJudge(3, arrayOf(intArrayOf(1,3), intArrayOf(2,3))))
    }

    @Test
    fun caseThree(){
        assertEquals(-1, sol.findJudge(3, arrayOf(intArrayOf(1,3), intArrayOf(2,3), intArrayOf(3,1))))
    }
}