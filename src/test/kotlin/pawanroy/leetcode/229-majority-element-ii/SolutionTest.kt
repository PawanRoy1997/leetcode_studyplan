package pawanroy.leetcode.`229-majority-element-ii`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals(listOf(3), sol.majorityElement(intArrayOf(3,2,3)))
    }

    @Test
    fun caseTwo(){
        assertEquals(listOf(1,2), sol.majorityElement(intArrayOf(1,2)))
    }

    @Test
    fun caseThree(){
        assertEquals(emptyList(), sol.majorityElement(intArrayOf()))
        assertEquals(emptyList(), sol.majorityElement(intArrayOf(1,2,3)))
    }
}