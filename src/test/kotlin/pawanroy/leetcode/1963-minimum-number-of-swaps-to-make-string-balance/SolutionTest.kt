package pawanroy.leetcode.`1963-minimum-number-of-swaps-to-make-string-balance`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(1, sol.minSwaps("][]["))
    }

    @Test
    fun caseTwo(){
        assertEquals(2, sol.minSwaps("]]][[["))
    }

    @Test
    fun caseThree(){
        assertEquals(0, sol.minSwaps("[][]"))
        assertEquals(0, sol.minSwaps("[]"))
    }

    @Test
    fun caseFour(){
        assertEquals(1, sol.minSwaps("][][]["))
    }
}