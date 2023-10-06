package pawanroy.leetcode.`343-integer-break`

class Solution {

    fun integerBreak(n: Int): Int {
        if (n <= 3) return n - 1
        var number = n
        var result = 1
        while (number >= 5) {
            result *= 3
            number -= 3
        }
        result *= number
        return result
    }
}