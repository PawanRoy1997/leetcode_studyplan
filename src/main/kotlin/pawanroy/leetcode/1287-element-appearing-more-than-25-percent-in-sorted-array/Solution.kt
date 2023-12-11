package pawanroy.leetcode.`1287-element-appearing-more-than-25-percent-in-sorted-array`

class Solution {
    fun findSpecialInteger(arr: IntArray): Int {
        val threshold = arr.size/4
        var count = 0
        var prev = 0
        for(num in arr){
            if(prev == num) count ++
            else {
                count = 1
                prev = num
            }
            if(count >= threshold){
                return num
            }
        }
        return -1
    }
}