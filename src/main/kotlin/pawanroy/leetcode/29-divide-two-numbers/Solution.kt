package pawanroy.leetcode.`29-divide-two-numbers`

import kotlin.math.abs

class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
        if(dividend == divisor) return 1
        if(divisor == 0) return if(dividend > 0) Int.MAX_VALUE else Int.MIN_VALUE
        if(divisor == Int.MIN_VALUE) return 0
        if(dividend == Int.MIN_VALUE && divisor == -1) return Int.MAX_VALUE

        var result = 0L
        val isNegative = (dividend > 0) xor (divisor > 0)
        var dividendL = abs(dividend.toLong())
        val divisorL = abs(divisor.toLong())

        var temp: Long
        var count: Long
        while(dividendL >= divisorL){
            temp = divisorL
            count = 1L
            while(dividendL >= temp){
                dividendL -= temp
                result+= count
                count = count shl 1
                temp = temp shl 1
            }
        }

        if(isNegative) result = -result
        return result.coerceIn(Int.MIN_VALUE.toLong(), Int.MAX_VALUE.toLong()).toInt()
    }
}