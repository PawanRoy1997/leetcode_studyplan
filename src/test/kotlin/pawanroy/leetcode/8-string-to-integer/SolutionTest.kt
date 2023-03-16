package pawanroy.leetcode.`8-string-to-integer`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(42, sol.myAtoi("42"))
    }

    @Test
    fun caseZero() {
        assertEquals(0, sol.myAtoi(""))
    }

    @Test
    fun caseNegative() {
        assertEquals(-42, sol.myAtoi("-42"))
    }

    @Test
    fun caseWithSpace() {
        assertEquals(-42, sol.myAtoi("    -42"))
    }

    @Test
    fun casePositive() {
        assertEquals(0, sol.myAtoi("    -+42"))
    }

    @Test
    fun caseWithWords() {
        assertEquals(4193, sol.myAtoi("4193 with words"))
    }

    @Test
    fun caseWordsFirst() {
        assertEquals(0, sol.myAtoi("words and 987"))
    }

    @Test
    fun caseOverflow() {
        assertEquals(-2147483648, sol.myAtoi("-91283472332"))
    }
}