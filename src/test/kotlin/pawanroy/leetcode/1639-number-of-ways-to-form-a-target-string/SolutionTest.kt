package pawanroy.leetcode.`1639-number-of-ways-to-form-a-target-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(6, sol.numWays(arrayOf("acca", "bbbb", "caca"), "aba"))
    }

    @Test
    fun caseTwo() {
        assertEquals(4, sol.numWays(arrayOf("abba", "baab"), "bab"))
    }

    @Test
    fun caseThree() {
        val arr = arrayOf(
            "bacadbdbbd",
            "ddaddccacd",
            "ccddaddddd",
            "cbbddbcddb",
            "addbccddaa",
            "bababbddbd",
            "dadcddcaba",
            "cdcaababda",
            "bbdadbcddd",
            "acbcabdaba",
            "aaaccabaaa",
            "cdacccacba",
            "cabdadddaa",
            "abdbaabcad",
            "cbcdcdaddd",
            "aacadaccdd",
            "acccbbadcc",
            "acbcdccdaa",
            "bdddcbcdac",
            "aadbcdbcba",
            "caabdabcaa",
            "cdbddcbbaa",
            "bdbdccdaba",
            "bddcaabbdb",
            "dbcdabcdbb",
            "cbadcaccca",
            "abcacdbaca",
            "bddccdcccb",
            "baddccdcaa",
            "ddadcdbdab"
        )
        assertEquals(144313472, sol.numWays(arr, "bcbbacba"))
    }
}