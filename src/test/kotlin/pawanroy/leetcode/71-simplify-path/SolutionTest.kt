package pawanroy.leetcode.`71-simplify-path`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("/home", sol.simplifyPath("/home/"))
    }

    @Test
    fun caseTwo() {
        assertEquals("/", sol.simplifyPath("/../"))
    }

    @Test
    fun caseThree() {
        assertEquals("/home/foo", sol.simplifyPath("/home//foo/"))
    }

    @Test
    fun caseFour() {
        assertEquals("/c", sol.simplifyPath("/a/./b/../../c/"))
    }
}