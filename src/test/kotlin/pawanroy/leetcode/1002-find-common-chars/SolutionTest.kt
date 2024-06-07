package pawanroy.leetcode.`1002-find-common-chars`

import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(): Unit {
        val res = sol.commonChars(arrayOf("bella","label","roller"))
        res.forEach(::println)
    }
}