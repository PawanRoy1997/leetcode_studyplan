package pawanroy.leetcode.two_sum

import org.junit.jupiter.api.Test

class SolutionTest{
    @Test
    fun testCaseOne(){
        val twoSum = Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)
        assert(twoSum.contentEquals(intArrayOf(0,1)))
    }
    @Test
    fun testCaseTwo(){
        val twoSum = Solution().twoSum(intArrayOf(3,2,4), 6)
        assert(twoSum.contentEquals(intArrayOf(1,2)))
    }
    @Test
    fun testCaseThree(){
        val twoSum = Solution().twoSum(intArrayOf(), 6)
        assert(twoSum.contentEquals(intArrayOf()))
    }
}