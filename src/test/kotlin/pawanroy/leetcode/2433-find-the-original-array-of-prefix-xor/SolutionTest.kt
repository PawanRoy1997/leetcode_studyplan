package pawanroy.leetcode.`2433-find-the-original-array-of-prefix-xor`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertArrayEquals(intArrayOf(1), sol.findArray(intArrayOf(1)))
        assertArrayEquals(intArrayOf(1,3), sol.findArray(intArrayOf(1,2)))
    }

    @Test
    fun caseTwo(){
        assertArrayEquals(intArrayOf(1,3,2), sol.findArray(intArrayOf(1, 2, 0)))
    }
}