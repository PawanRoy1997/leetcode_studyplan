package pawanroy.leetcode.`20-valid-parantheses`

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
    fun smallFFTest() {
        assertFalse { solution.isValid("[()") }
    }

    @Test
    fun mediumFFTest() {
        assertFalse { solution.isValid("{[]") }
    }

    @Test
    fun largeFFTest() {
        assertFalse { solution.isValid("[{}") }
    }

    @Test
    fun smallFTest() {
        assertFalse { solution.isValid(")(") }
    }

    @Test
    fun mediumFTest() {
        assertFalse { solution.isValid("][") }
    }

    @Test
    fun largeFTest() {
        assertFalse { solution.isValid("}{") }
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