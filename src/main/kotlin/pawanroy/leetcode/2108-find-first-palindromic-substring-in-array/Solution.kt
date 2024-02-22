package pawanroy.leetcode.`2108-find-first-palindromic-substring-in-array`

class Solution {
    fun firstPalindrome(words: Array<String>): String {
        var result = ""
        if (words.isEmpty()) return result
        var index = 0
        while (index in words.indices) {
            if (words[index].isPalindrome()) {
                result = words[index]
                break
            }
            index++
        }

        return result
    }

    private fun String.isPalindrome(): Boolean {
        return this.equals(StringBuilder(this).reverse().toString())
    }
}