package pawanroy.leetcode.`880-decoded-string-at-index`

class Solution {
    fun decodeAtIndex(s: String, k: Int): String {
        var cursor = k
        var index = 0
        var currentLength = 0L

        while (currentLength < k) {
            if (s[index].isDigit()) currentLength *= s[index] - '0'
            else currentLength++
            index++
        }

        for (j in index - 1 downTo 0) {
            if (s[j].isDigit()) {
                currentLength /= s[j] - '0'
                cursor = (cursor % currentLength).toInt()
            }
            else{
                if(cursor == 0 || cursor == currentLength.toInt()){
                    return s[j].toString()
                }
                currentLength --
            }
        }
        return ""
    }
}