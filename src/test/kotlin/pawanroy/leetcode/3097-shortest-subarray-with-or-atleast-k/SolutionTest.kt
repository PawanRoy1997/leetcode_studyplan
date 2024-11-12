package pawanroy.leetcode.`3097-shortest-subarray-with-or-atleast-k`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(3, sol.minimumSubarrayLength(intArrayOf(2,1,8), 10))
    }

    @Test
    fun caseTwo(){
        assertEquals(1, sol.minimumSubarrayLength(intArrayOf(1,2,3), 2))
    }

    @Test
    fun caseThree(){
        assertEquals(1, sol.minimumSubarrayLength(intArrayOf(1,3,3,3,3,64), 63))
    }
}