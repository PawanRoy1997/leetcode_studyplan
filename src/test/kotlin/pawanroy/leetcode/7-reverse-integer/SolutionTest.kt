package pawanroy.leetcode.`7-reverse-integer`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(321, sol.reverse(123))
    }

    @Test
    fun caseOverflow(){
        assertEquals(0, sol.reverse(1534236469))
    }

    @Test
    fun caseNegativeOverflow(){
        assertEquals(0, sol.reverse(-1534236469))
    }

    @Test
    fun caseTwoNegativeOverflow(){
        assertEquals(0, sol.reverse(-2147483648))
    }

    @Test
    fun caseTwoOverflow(){
        assertEquals(2147483641, sol.reverse(1463847412))
    }
}