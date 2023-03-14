package pawanroy.leetcode.`28-find-the-index-of-the-first-occurence-in-the-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private var solution = Solution()

    @Test
    fun caseOne() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"))
    }

    @Test
    fun caseTwo() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"))
    }
}