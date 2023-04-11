package pawanroy.leetcode.`2390-removing-stars-from-a-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("lecoe", sol.removeStars("leet**cod*e"))
    }

    @Test
    fun caseTwo() {
        assertEquals("", sol.removeStars("erase*****"))
    }
}