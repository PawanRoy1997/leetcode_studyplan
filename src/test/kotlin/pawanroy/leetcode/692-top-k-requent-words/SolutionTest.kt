package pawanroy.leetcode.`692-top-k-requent-words`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(listOf("i", "love"), sol.topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 2))
        assertEquals(
            listOf("i", "love", "coding"),
            sol.topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 3)
        )
    }
}