package pawanroy.leetcode.`2530-maximal-score-after-applying-k-operations`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(50L, sol.maxKelements(intArrayOf(10,10,10,10,10,10), 5))
    }

    @Test
    fun caseTwo(){
        assertEquals(17L, sol.maxKelements(intArrayOf(1,10,3,3,3), 3))
    }

    @Test
    fun caseThree(){
        assertEquals(3603535575L, sol.maxKelements(intArrayOf(756902131,995414896,95906472,149914376,387433380,848985151), 6))
    }
}