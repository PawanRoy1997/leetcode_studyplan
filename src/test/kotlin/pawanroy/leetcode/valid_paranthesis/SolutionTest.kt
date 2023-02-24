package pawanroy.leetcode.valid_paranthesis

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val solution = Solution()

    @Test
    fun smallTest() {
        assertTrue { solution.isValid("()") }
    }

    @Test
    fun mediumTest() {
        assertTrue { solution.isValid("[]") }
    }

    @Test
    fun largeTest() {
        assertTrue { solution.isValid("{}") }
    }

    @Test
    fun allBracketsTest() {
        assertTrue { solution.isValid("()[]{}") }
    }

    @Test
    fun complexTest() {
        assertTrue { solution.isValid("{[()]}") }
    }

    @Test
    fun invalidTest() {
        assertFalse { solution.isValid("{[(()]}") }
    }
}