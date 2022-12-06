package pawanroy.leetcode.is_subsequence

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    @Test
    fun testCaseOne() {
        assertTrue { Solution().isSubsequence("abc","ahbgdc") }
    }

    @Test
    fun testCaseTwo() {
        assertTrue { Solution().isSubsequence("ab","baab") }
    }

    @Test
    fun testCaseFour() {
        assertFalse { Solution().isSubsequence("ab","ba") }
    }

    @Test
    fun testCaseThree(){
        assertTrue { Solution().isSubsequence("abcc","baaaabbbcccc") }
    }
}