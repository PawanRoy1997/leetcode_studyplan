package pawanroy.leetcode.`844-backspace-string-compare`

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.backspaceCompare("ab#c", "ad#c"))
    }

    @Test
    fun caseTwo() {
        assertTrue(sol.backspaceCompare("ab##", "a#d#"))
    }

    @Test
    fun caseThree() {
        assertFalse(sol.backspaceCompare("ab##a", "a#d#b"))
    }
}