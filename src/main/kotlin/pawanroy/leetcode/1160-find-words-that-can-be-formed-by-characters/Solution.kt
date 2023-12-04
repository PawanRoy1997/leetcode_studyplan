package pawanroy.leetcode.`1160-find-words-that-can-be-formed-by-characters`

class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        val count = IntArray(26) { 0 }
        val ref = IntArray(26)
        var isComplete: Boolean
        var result = 0

        // Initialize count
        chars.forEach { char -> count[char - 'a']++ }
        words.forEach { word ->
            // Check if word can be formed with the ref
            count.forEachIndexed { index, value -> ref[index] = value }
            isComplete = true
            word.forEach { char ->
                if (ref[char - 'a'] > 0) ref[char - 'a']-- else isComplete = false
            }
            if (isComplete) result += word.length
        }

        return result
    }
}