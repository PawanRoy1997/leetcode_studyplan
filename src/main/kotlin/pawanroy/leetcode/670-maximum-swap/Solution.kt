package pawanroy.leetcode.`670-maximum-swap`


class Solution {
    fun maximumSwap(num: Int): Int {
        val digits = StringBuilder(num.toString())
        var c1 = 0
        while(c1 <= digits.lastIndex){
            var maxIndex = c1
            var max = digits[c1]
            for(j in c1+1..digits.lastIndex){
                if(digits[j] >= max){
                    max = digits[j]
                    maxIndex = j
                }
            }

            if(max> digits[c1]){
                digits[maxIndex] = digits[c1]
                digits[c1] = max
                break
            }

            c1++
        }

        return digits.toString().toInt()
    }
}