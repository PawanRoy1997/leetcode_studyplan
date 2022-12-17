package pawanroy.leetcode.fabonacci_number

class Solution {
    fun fib(n: Int): Int {
        var result = 0
        var prev = 1
        var swap = 0
        repeat(n) {
            result += prev
            prev = swap
            swap = result
        }
        return result
    }
}