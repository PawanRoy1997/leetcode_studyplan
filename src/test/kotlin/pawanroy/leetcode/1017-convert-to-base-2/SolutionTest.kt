package pawanroy.leetcode.`1017-convert-to-base-2`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseZero(){
        assertEquals("0", sol.baseNeg2(0))
    }
    @Test
    fun caseOne(){
        assertEquals("1", sol.baseNeg2(1))
    }

    @Test
    fun caseTwo(){
        assertEquals("110", sol.baseNeg2(2))
    }

    @Test
    fun caseThree(){
        assertEquals("111", sol.baseNeg2(3))
    }

    @Test
    fun caseFour(){
        assertEquals("100", sol.baseNeg2(4))
    }

    @Test
    fun caseFive(){
        assertEquals("101", sol.baseNeg2(5))
    }

    @Test
    fun caseSix(){
        assertEquals("11010", sol.baseNeg2(6))
    }

    @Test
    fun caseTen(){
        assertEquals("11110", sol.baseNeg2(10))
    }

    @Test
    fun caseTwentyTwo(){
        assertEquals("1101010", sol.baseNeg2(22))
    }
}