package pawanroy.leetcode.`3136-string-compression`

class Solution {
    fun compressedString(word: String): String {
        val sb = StringBuilder()

        var current = word.first()
        var count = 0

        word.toCharArray().forEach {
            if(it != current || count == 9) {
                sb.append("$count$current")
                current = it
                count=0
            }
            if(it == current) count++
        }

        sb.append("$count$current")

        return sb.toString()
    }
}