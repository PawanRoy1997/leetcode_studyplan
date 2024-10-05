package pawanroy.leetcode.`567-permutation-string`

import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val result = sol.checkInclusion("ab", "eidbaooo")
        assert(result)
    }

    @Test
    fun caseTwo() {
        val result = sol.checkInclusion("ab", "eidboaoo")
        assert(!result)
    }

    @Test
    fun caseThree() {
        val result = sol.checkInclusion("adc", "dcda")
        assert(result)
    }
}