package pawanroy.leetcode.`334-increasing-triplet-subsequence`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    @Test
    fun caseOne(){
        val input = intArrayOf(1,2,3,4,5)
        assertTrue { Solution().increasingTriplet(input) }
    }

    @Test
    fun caseTwo(){
        val input = intArrayOf(2,1,5,0,4,6)
        assertTrue { Solution().increasingTriplet(input) }
    }

    @Test
    fun caseThree(){
        val input = intArrayOf(5,4,3,2,1)
        assertFalse { Solution().increasingTriplet(input) }
    }
}