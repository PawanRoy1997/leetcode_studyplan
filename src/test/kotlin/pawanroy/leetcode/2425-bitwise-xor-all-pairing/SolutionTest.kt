package pawanroy.leetcode.`2425-bitwise-xor-all-pairing`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(13, sol.xorAllNums(nums1 = intArrayOf(2,1,3), nums2 = intArrayOf(10,2,5,0)))
    }

    @Test
    fun caseTwo(){
        assertEquals(0, sol.xorAllNums(nums1 = intArrayOf(1,2), nums2 = intArrayOf(3,4)))
    }
}