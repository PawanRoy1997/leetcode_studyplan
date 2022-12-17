package pawanroy.leetcode.fabonacci_number

class Solution {
    fun fib(n: Int): Int {
        return if (n > 1) fib(n - 1) + fib(n - 2)
        else n
    }
}