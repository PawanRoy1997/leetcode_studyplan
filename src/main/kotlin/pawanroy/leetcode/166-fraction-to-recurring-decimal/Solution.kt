package pawanroy.leetcode.`166-fraction-to-recurring-decimal`

import kotlin.math.abs

class Solution {
    fun fractionToDecimal(numerator: Int, denominator: Int): String {
        if (numerator == 0) return "0"

        val sb = StringBuilder()

        // Handle sign
        val sign = (numerator.toLong() > 0) xor (denominator.toLong() > 0)
        if (sign) sb.append("-")

        val n = abs(numerator.toLong())
        val d = abs(denominator.toLong())

        // Integer part
        sb.append(n / d)
        var remainder = n % d
        if (remainder == 0L) return sb.toString()

        sb.append(".")
        val map = HashMap<Long, Int>()

        while (remainder != 0L) {
            if (map.containsKey(remainder)) {
                sb.insert(map[remainder]!!, "(")
                sb.append(")")
                break
            }

            map[remainder] = sb.length
            remainder *= 10
            sb.append(remainder / d)
            remainder %= d
        }

        return sb.toString()
    }
}
