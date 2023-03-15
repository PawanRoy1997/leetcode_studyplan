package pawanroy.leetcode.`3-longest-substring-without-repeating-characters`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(1,sol.lengthOfLongestSubstring("bbbbbb"))
    }

    @Test
    fun caseTwo(){
        assertEquals(3,sol.lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun caseThree(){
        assertEquals(3,sol.lengthOfLongestSubstring("pwwkew"))
    }

    @Test
    fun caseFour(){
        assertEquals(2, sol.lengthOfLongestSubstring("ab"))
    }

    @Test
    fun caseFive(){
        assertEquals(2, sol.lengthOfLongestSubstring("cdd"))
    }

    @Test
    fun caseSix(){
        assertEquals(3, sol.lengthOfLongestSubstring("dvdf"))
    }
}