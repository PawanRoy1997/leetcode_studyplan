package pawanroy.leetcode.`1679-max-number-of-k-sum-pairs`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun caseOne(){
        assertEquals(1, Solution().maxOperations(intArrayOf(3,1,3,4,3), 6))
    }
    @Test
    fun caseTwo(){
        assertEquals(2, Solution().maxOperations(intArrayOf(1,2,3,4), 5))
    }
    @Test
    fun caseThree(){
        assertEquals(0, Solution().maxOperations(intArrayOf(3,5,1,5), 2))
    }
}