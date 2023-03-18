package pawanroy.leetcode.`10-regular-expression-matching`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun emptyPattern() {
        assertTrue(sol.isMatch("",""))
        assertTrue(sol.isMatch("",".*"))
    }
    @Test
    fun caseSingleCharacterPattern() {
        assertTrue(sol.isMatch("a", "a"))
        assertFalse(sol.isMatch("b", "a"))
    }

    @Test
    fun caseSingleCharacterDotPattern() {
        assertTrue(sol.isMatch("a", "."))
        assertTrue(sol.isMatch("b", "."))
    }

    @Test
    fun caseMultipleCharacterPatter() {
        assertTrue(sol.isMatch("aa", "a*"))
        assertTrue(sol.isMatch("bb", ".*"))
    }

    @Test
    fun caseComplexCharacterPatter() {
//        assertTrue(sol.isMatch("abcaaaaa", "abca*"))
        assertTrue(sol.isMatch("abcaaaaaba", "abca*ba"))
//        assertFalse(sol.isMatch("abcaaaaaba", "abca*"))
    }

    @Test
    fun caseComplex() {
        assertTrue(sol.isMatch("abb", "c*a*b*"))
        assertFalse(sol.isMatch("abbc", ".*b"))
        assertTrue(sol.isMatch("abbc", ".*c"))
        assertTrue(sol.isMatch("cccccccccc", "c*c"))
    }
}