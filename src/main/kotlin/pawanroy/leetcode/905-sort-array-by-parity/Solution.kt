package pawanroy.leetcode.`905-sort-array-by-parity`

import java.util.*

class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        val result = IntArray(nums.size){ 0 }
        val temp: Stack<Int> = Stack<Int>()
        var index = 0
        nums.forEach { n->
            if(n % 2 == 0) {
                result[index] = n
                index++
            }
            else {
                temp.add(n)
            }
        }

        while(!temp.isEmpty()) {
            result[index] = temp.pop()
            index++
        }

        return result
    }
}