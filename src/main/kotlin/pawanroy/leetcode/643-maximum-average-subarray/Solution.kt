package pawanroy.leetcode.`643-maximum-average-subarray`

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        val shiftSpace = nums.size - k
        var average: Double = 0.0
        // Meta data
        val leftSum = Array(shiftSpace){ nums[it] }
        val rightSum = Array(shiftSpace){ nums[k+it] }
        for(i in 1 until shiftSpace){
            leftSum[i]+=leftSum[i-1]
            rightSum[rightSum.lastIndex-i]+=rightSum[rightSum.lastIndex-i+1]
        }

        var startPtr = shiftSpace-1
        repeat(shiftSpace) {
            // Chose correct start and end
            if (startPtr != leftSum.size && leftSum[startPtr] < rightSum[startPtr]) startPtr++
            else if(startPtr != 0) startPtr--
        }

        // Find average
        for(i in 0 until k){
            average+=nums[startPtr+i]
        }
        return average/k
    }
}