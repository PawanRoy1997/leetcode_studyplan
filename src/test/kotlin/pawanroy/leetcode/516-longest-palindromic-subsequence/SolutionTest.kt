package pawanroy.leetcode.`516-longest-palindromic-subsequence`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(4, sol.longestPalindromeSubseq("bbbcb"))
    }

    @Test
    fun caseTwo() {
        assertEquals(2, sol.longestPalindromeSubseq("abbd"))
    }

    @Test
    fun caseThree() {
        assertEquals(3, sol.longestPalindromeSubseq("abbbd"))
    }

    @Test
    fun caseFour() {
        assertEquals(1, sol.longestPalindromeSubseq("abcdef"))
    }

    @Test
    fun caseFive() {
        assertEquals(9, sol.longestPalindromeSubseq("abacacabaa"))
    }

    @Test
    fun caseSix() {
        assertEquals(6, sol.longestPalindromeSubseq("aabaaba"))
    }
}