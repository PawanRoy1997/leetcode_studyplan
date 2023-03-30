package pawanroy.leetcode.`87-scramle-string`

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.isScramble("a", "a"))
    }

    @Test
    fun caseTwo() {
        assertTrue(sol.isScramble("abcde", "abcde"))
        assertTrue(sol.isScramble("abcde", "abced"))
        assertTrue(sol.isScramble("abcde", "abedc"))
        assertTrue(sol.isScramble("abcde", "aedbc"))
        assertTrue(sol.isScramble("abcd", "adbc"))
    }

    @Test
    fun caseThree() {
        assertFalse(sol.isScramble("b", "a"))
        assertFalse(sol.isScramble("aa", "ab"))
        assertFalse(sol.isScramble("aab", "aaa"))
    }
}