package pawanroy.leetcode.`2197-replace-non-coprimes-in-array`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(listOf(12,7,6), sol.replaceNonCoprimes(intArrayOf(6,4,3,2,7,6,2)))
    }

    @Test
    fun caseTwo() {
        assertEquals(listOf(2009,20677,825), sol.replaceNonCoprimes(intArrayOf(287,41,49,287,899,23,23,20677,5,825)))
    }

    @Test
    fun caseThree() {
        assertEquals(listOf(31,97561), sol.replaceNonCoprimes(intArrayOf(31,97561,97561,97561,97561,97561,97561,97561,97561)))
    }
}