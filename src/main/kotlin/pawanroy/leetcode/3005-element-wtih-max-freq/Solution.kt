package pawanroy.leetcode.`3005-element-wtih-max-freq`


class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val freq = IntArray(101) { 0 }
        var max = 0
        var count = 0
        nums.forEach {
            freq[it] = freq[it]+1
            if(max < freq[it]){
                max = freq[it]
                count = 0
            }

            if(max == freq[it]) count += max
        }
        return count
    }
}