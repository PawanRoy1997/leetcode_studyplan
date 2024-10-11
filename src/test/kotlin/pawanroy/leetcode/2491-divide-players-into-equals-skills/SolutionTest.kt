package pawanroy.leetcode.`2491-divide-players-into-equals-skills`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(22, sol.dividePlayers(intArrayOf(3,2,5,1,3,4)))
    }

    @Test
    fun caseTwo(){
        assertEquals(12, sol.dividePlayers(intArrayOf(3,4)))
    }

    @Test
    fun caseThree(){
        assertEquals(-1, sol.dividePlayers(intArrayOf(1,1,2,3)))
    }
}