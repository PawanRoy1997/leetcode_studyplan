package pawanroy.leetcode.`2264-largets-3-same-digit-number-in-string`

class Solution {
    fun largestGoodInteger(num: String): String {
        var max = -1
        for (i in 2..num.lastIndex) {
            if (num[i] == num[i - 1] && num[i - 1] == num[i - 2])
                max = maxOf(num.substring(i - 2, i+1).toInt(), max)
        }
        return if(max == -1) "" else if(max == 0) "000" else max.toString()
    }
}