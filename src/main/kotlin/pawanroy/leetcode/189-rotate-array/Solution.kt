package pawanroy.leetcode.`189-rotate-array`

class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val r = k % nums.size
        val res = IntArray(nums.size) {
            print(it)
            println(it - r)
            if (it - r < 0) nums[(nums.size + it) - r]
            else nums[(it - r)]
        }
        for (i in nums.indices) nums[i] = res[i]
    }
}