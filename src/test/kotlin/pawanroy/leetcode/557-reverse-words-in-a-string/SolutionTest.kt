package pawanroy.leetcode.`557-reverse-words-in-a-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", sol.reverseWords("Let's take LeetCode contest"))
    }
}