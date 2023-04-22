package pawanroy.leetcode.`1312-minimum-insertion-to-make-a-single-palindrome`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(0, sol.minInsertions("zzazz"))
    }

    @Test
    fun caseTwo() {
        assertEquals(2, sol.minInsertions("mbadm"))
    }

    @Test
    fun caseThree() {
        assertEquals(5, sol.minInsertions("leetcode"))
    }

    @Test
    fun caseFour() {
        assertEquals(5, sol.minInsertions("zjveiiwvc"))
    }
}