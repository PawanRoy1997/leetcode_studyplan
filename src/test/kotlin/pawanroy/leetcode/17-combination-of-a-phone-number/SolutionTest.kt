package pawanroy.leetcode.`17-combination-of-a-phone-number`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertArrayEquals(arrayOf("ad","ae","af","bd","be","bf","cd","ce","cf"), sol.letterCombinations("23").toTypedArray())
    }
}