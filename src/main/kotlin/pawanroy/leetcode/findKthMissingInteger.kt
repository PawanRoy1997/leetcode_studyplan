package pawanroy.leetcode

class Solution {
    fun findKthPositive(arr: IntArray, k: Int): Int {

        for (i in arr.indices) {
            if (arr[i] - i - 1 >= k) {
                return i + k
            }
        }
        return arr.size+k
    }
}