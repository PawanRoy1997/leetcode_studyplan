package pawanroy.leetcode.`316-remove-duplicate-letters`

import java.util.*

class Solution {
    fun removeDuplicateLetters(s: String): String {

        // We are going to reuse this.
        val toCharArray = s.toCharArray()

        // Get the last index of unique characters
        val lastIndexOfChar = IntArray(26)
        toCharArray.forEachIndexed { index: Int, c: Char -> lastIndexOfChar[c - 'a'] = index }

        // To check if character is already added in the result
        val seen = BooleanArray(26)

        val stack = Stack<Int>()

        var currentChar: Int
        toCharArray.forEachIndexed { index, c ->
            currentChar = c - 'a'

            // If character is already contained in the result then we do not add it
            if (seen[currentChar]) return@forEachIndexed

            // If character is unique then we have to check if previous characters are smaller than this or not
            while (!stack.isEmpty() && stack.peek() > currentChar && index < lastIndexOfChar[stack.peek()]) {
                seen[stack.pop()] = false
            }

            // After correcting stack we will add the character
            stack.add(currentChar)
            seen[currentChar] = true
        }

        val result = StringBuilder()
        while (!stack.isEmpty()) {
            result.append((stack.pop() + 'a'.code).toChar())
        }
        return result.reverse().toString()
    }
}