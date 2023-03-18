package pawanroy.leetcode.`12-integer-to-roman`

class Solution {

    private val map = mapOf(
        1 to "I",
        4 to "IV",
        5 to "V",
        9 to "IX",
        10 to "X",
        40 to "XL",
        50 to "L",
        90 to "XC",
        100 to "C",
        400 to "CD",
        500 to "D",
        900 to "CM",
        1000 to "M"
    )

    private val values = arrayListOf(
        1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000
    )

    fun intToRoman(num: Int): String {
        var value = num
        val sb = StringBuilder()
        var ptr = values.lastIndex

        while(value > 0){
            if(value >= values[ptr]){
                value -= values[ptr]
                sb.append(map[values[ptr]])
            }else{
                ptr--
            }
        }

        return sb.toString()
    }
}