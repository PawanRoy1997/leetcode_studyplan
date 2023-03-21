package pawanroy.leetcode.`443-string-compression`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(
            6,
            sol.compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')),
            "LeetCode Case - 1"
        )
    }

    @Test
    fun caseTwo() {
        assertEquals(
            1,
            sol.compress(charArrayOf('a')),
            "LeetCode Case - 2"
        )
    }

    @Test
    fun caseThree() {
        assertEquals(
            4,
            sol.compress(charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')),
            "LeetCode Case - 2"
        )
    }
}