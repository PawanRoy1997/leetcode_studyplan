package pawanroy.leetcode.`1394-find-lucky-integer-in-array`

class Solution {
    fun findLucky(arr: IntArray): Int {
        val frequency = Array(501) { 0 }
        var ans = -1

        arr.forEach {
            frequency[it] = frequency[it] + 1
        }

        for(i in frequency.indices){
            if(i == frequency[i]){
                ans = maxOf(i, ans)
            }
        }

        return if(ans == 0) -1 else ans
    }
}