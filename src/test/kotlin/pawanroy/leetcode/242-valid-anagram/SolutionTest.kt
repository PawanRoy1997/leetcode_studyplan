package pawanroy.leetcode.`242-valid-anagram`

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private lateinit var sol: Solution

    @BeforeEach
    fun setup() {
        sol = Solution()
    }

    @Test
    fun caseOne() {
        assertTrue(sol.isAnagram("anagram", "nagaram"))
    }

    @Test
    fun caseTwo() {
        assertFalse(sol.isAnagram("anagram", "nbgaram"))
    }
}