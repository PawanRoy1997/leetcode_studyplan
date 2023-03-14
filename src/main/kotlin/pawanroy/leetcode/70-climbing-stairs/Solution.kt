package pawanroy.leetcode.`70-climbing-stairs`

class Solution {
    fun climbStairs(n: Int): Int {
        var result = 0
        var swap = 1
        var prev = 1
        repeat(n){
            result += prev
            prev = swap
            swap = result
        }
        return result
    }
}