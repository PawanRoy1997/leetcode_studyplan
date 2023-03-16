package pawanroy.leetcode.`8-string-to-integer`

class Solution {
    fun myAtoi(s: String): Int {
        var res = 0L
        var negative = 0
        var d = false

        for (c in s.toCharArray()) {

            if (Character.isDigit(c)) {
                d = true
                res *= 10
                res += c - '0'
            } else {
                if (negative != 0) break
                negative = if (!d) {
                    if (c == ' ') 0
                    else if (c == '-') 2
                    else if (c == '+') 1
                    else break
                } else {
                    break
                }
            }

            if (res > Int.MAX_VALUE) return if (negative == 2) Int.MIN_VALUE else Int.MAX_VALUE
        }
        return if (negative == 2) -res.toInt() else res.toInt()
    }
}