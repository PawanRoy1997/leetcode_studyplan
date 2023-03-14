package pawanroy.leetcode.`14-longest-common-prefix`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun caseOne(){
        assertEquals("fl", solution.longestCommonPrefix(arrayOf("flower","flow","flight")))
    }

    @Test
    fun caseTwo(){
        assertEquals("c", solution.longestCommonPrefix(arrayOf("cir","car","can")))
    }
}