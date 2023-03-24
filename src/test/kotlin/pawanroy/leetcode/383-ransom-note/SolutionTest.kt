package pawanroy.leetcode.`383-ransom-note`

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private lateinit var sol: Solution

    @BeforeEach
    fun setUp() {
        sol = Solution()
    }

    @Test
    fun caseOne() {
        assertTrue(sol.canConstruct("a", "aa"))
        assertFalse(sol.canConstruct("aa", "a"))
    }

    @Test
    fun caseTwo() {
        assertFalse(sol.canConstruct("ab", "aa"))
    }

    @Test
    fun caseThree() {
        assertFalse(sol.canConstruct("aa", "ac"))
    }
}