package pawanroy.leetcode.is_subsequence

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testCaseOne() {
        assertTrue { solution.isSubsequence("abc","ahbgdc") }
    }

    @Test
    fun testCaseTwo() {
        assertTrue { solution.isSubsequence("ab","baab") }
    }

    @Test
    fun testCaseThree(){
        assertTrue { solution.isSubsequence("abcc","baaaabbbcccc") }
    }

    @Test
    fun testCaseFour() {
        assertFalse { solution.isSubsequence("ab","ba") }
    }

    @Test
    fun testCaseFive(){
        assertTrue { solution.isSubsequence("", "ab") }
    }

    @Test
    fun testCaseSix(){
        assertFalse { solution.isSubsequence("abc", "ab") }
    }

    @Test
    fun testCaseSeven(){
        assertFalse { solution.isSubsequence("abc", "efghij") }
    }
}