package pawanroy.leetcode.find_the_index_of_first_occurence

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