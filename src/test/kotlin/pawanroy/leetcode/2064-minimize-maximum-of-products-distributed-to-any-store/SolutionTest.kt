package pawanroy.leetcode.`2064-minimize-maximum-of-products-distributed-to-any-store`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(3, sol.minimizedMaximum(6, intArrayOf(11,6)))
    }

    @Test
    fun caseTwo(){
        assertEquals(5, sol.minimizedMaximum(7, intArrayOf(15,10,10)))
    }

    @Test
    fun caseThree(){
        assertEquals(15, sol.minimizedMaximum(3, intArrayOf(15,10,10)))
    }
}