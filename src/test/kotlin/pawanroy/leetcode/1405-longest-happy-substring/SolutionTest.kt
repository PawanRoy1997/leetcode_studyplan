package pawanroy.leetcode.`1405-longest-happy-substring`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals("ccaccbcc", sol.longestDiverseString(1,1,7))
    }

    @Test
    fun caseTwo(){
        assertEquals("aabaa", sol.longestDiverseString(7,1,0))
    }

    @Test
    fun caseThree(){
        assertEquals("ababc", sol.longestDiverseString(2,2,1))
    }
}