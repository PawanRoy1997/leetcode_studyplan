package pawanroy.leetcode.`290-word-pattern`

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.wordPattern("abba", "dog cat cat dog"))
    }

    @Test
    fun caseTwo() {
        assertFalse(sol.wordPattern("abba", "dog cat cat fish"))
    }

    @Test
    fun caseThree() {
        assertFalse(sol.wordPattern("abbc", "dog cat cat dog"))
    }
}