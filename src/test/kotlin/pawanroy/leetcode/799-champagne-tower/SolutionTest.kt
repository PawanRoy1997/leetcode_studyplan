package pawanroy.leetcode.`799-champagne-tower`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun caseOne() {
        assertEquals(0.0, Solution().champagneTower(1, 1, 0))
        assertEquals(0.0, Solution().champagneTower(1, 1, 1))
        assertEquals(1.0, Solution().champagneTower(1, 0, 0))
    }

    @Test
    fun caseTwo(){
        assertEquals(0.5, Solution().champagneTower(2, 1, 0))
        assertEquals(0.5, Solution().champagneTower(2, 1, 1))
        assertEquals(1.0, Solution().champagneTower(2, 0, 0))
    }

    @Test
    fun caseThree(){
        assertEquals(1.0, Solution().champagneTower(3, 1, 0))
        assertEquals(1.0, Solution().champagneTower(3, 1, 1))
        assertEquals(1.0, Solution().champagneTower(3, 0, 0))
    }
}