package pawanroy.leetcode.`290-word-pattern`

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val wordToChar = HashMap<Char, String>()
        val charToWord = HashMap<String, Char>()
        val words = s.split(" ")

        if (pattern.length != words.size) return false

        for (i in pattern.indices) {
            val char = pattern[i]
            val word: String = words[i]
            if (wordToChar[char] == null && charToWord[word] == null) {
                wordToChar[char] = word
                charToWord[word] = char
            } else {
                if (char != charToWord[word] || word != wordToChar[char]) return false
            }
        }

        return true
    }
}