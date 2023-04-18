package pawanroy.leetcode.`1768-merge-string-alternatively`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("apbqcr", sol.mergeAlternately(word1 = "abc", word2 = "pqr"))
    }

    @Test
    fun caseTwo() {
        assertEquals("apbqrs", sol.mergeAlternately(word1 = "ab", word2 = "pqrs"))
    }

    @Test
    fun caseThree() {
        assertEquals("apbqcd", sol.mergeAlternately(word1 = "abcd", word2 = "pq"))
    }
}