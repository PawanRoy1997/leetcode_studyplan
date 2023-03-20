package pawanroy.leetcode.`17-combination-of-a-phone-number`

class Solution {
    private val charsAtNumber = arrayOf(
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    )

    fun letterCombinations(digits: String): List<String> {
        val result = mutableListOf<String>()
        val tmp = mutableListOf<String>()
        val s = StringBuilder(digits)
        s.reverse()
        s.forEach {
            if (result.isEmpty()) {
                charsAtNumber[it - '2'].toCharArray().forEach { c -> result.add(c.toString()) }
                return@forEach
            }
            tmp.clear()
            tmp.addAll(result)
            result.clear()
            charsAtNumber[it - '2'].toCharArray().forEach { char ->
                tmp.forEach { string ->
                    result.add("$char$string")
                }
            }
        }
        return result
    }
}