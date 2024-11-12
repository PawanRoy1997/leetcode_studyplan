package pawanroy.leetcode.`2601-prime-subtraction-operation`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertTrue { sol.primeSubOperation(intArrayOf(4,9,6,10)) }
    }

    @Test
    fun caseTwo(){
        assertTrue { sol.primeSubOperation(intArrayOf(6,8,11,12)) }
    }

    @Test
    fun caseThree(){
        assertFalse { sol.primeSubOperation(intArrayOf(5,8,3)) }
    }

    @Test
    fun caseFour(){
        assertTrue { sol.primeSubOperation(intArrayOf(998,2)) }
    }

    @Test
    fun caseFive(){
        assertFalse { sol.primeSubOperation(intArrayOf(32,8,97,27,30,78,15,61,60,88)) }
    }
}