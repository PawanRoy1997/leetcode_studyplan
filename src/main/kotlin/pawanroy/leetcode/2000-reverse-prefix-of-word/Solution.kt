package pawanroy.leetcode.`2000-reverse-prefix-of-word`

class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        var notFound = true
        val sb = StringBuilder()
        word.toCharArray().forEach{ c ->
            sb.append(c)
            if(c == ch && notFound){
                sb.reverse()
                notFound = false
            }
        }
        return sb.toString()
    }
}