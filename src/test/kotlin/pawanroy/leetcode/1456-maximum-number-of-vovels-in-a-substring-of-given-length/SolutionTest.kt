package pawanroy.leetcode.`1456-maximum-number-of-vovels-in-a-substring-of-given-length`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun caseOne(){
        val res = Solution().maxVowels("abciiidef", 3)
        assertEquals(3, res)
    }

    @Test
    fun caseTwo(){
        val res = Solution().maxVowels("leetcode", 3)
        assertEquals(2, res)
    }

    @Test
    fun caseThree(){
        val res = Solution().maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33)
        assertEquals(7, res)
    }
}