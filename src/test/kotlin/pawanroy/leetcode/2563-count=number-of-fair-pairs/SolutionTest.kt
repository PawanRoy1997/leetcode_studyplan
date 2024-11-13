package pawanroy.leetcode.`2563-count=number-of-fair-pairs`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(6L, sol.countFairPairs(intArrayOf(0,1,7,4,4,5), 3, 6))
    }

    @Test
    fun caseTwo(){
        assertEquals(1L, sol.countFairPairs(intArrayOf(1,7,9,2,5), 11,11))
    }

    @Test
    fun caseThree(){
        assertEquals(15L, sol.countFairPairs(intArrayOf(0,0,0,0,0,0), 0,0))
    }
}