package pawanroy.leetcode.`344-reverse-string`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val input = charArrayOf('h', 'e', 'l', 'l', 'o')
        val expected = charArrayOf('o', 'l', 'l', 'e', 'h')
        sol.reverseString(input)
        assertArrayEquals(expected, input)
    }

    @Test
    fun caseTwo() {
        val input = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        val expected = charArrayOf('h', 'a', 'n', 'n', 'a', 'H')
        sol.reverseString(input)
        assertArrayEquals(expected, input)
    }
}