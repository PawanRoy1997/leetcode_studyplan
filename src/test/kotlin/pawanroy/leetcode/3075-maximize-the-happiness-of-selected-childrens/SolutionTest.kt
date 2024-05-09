package pawanroy.leetcode.`3075-maximize-the-happiness-of-selected-childrens`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(4, sol.maximumHappinessSum(intArrayOf(1,2,3), 2))
    }

    @Test
    fun caseTwo(){
        assertEquals(1, sol.maximumHappinessSum(intArrayOf(1,1,1,1), 3))
    }

    @Test
    fun caseThree(){
        assertEquals(5, sol.maximumHappinessSum(intArrayOf(1,2,3,4,5),1))
    }
}