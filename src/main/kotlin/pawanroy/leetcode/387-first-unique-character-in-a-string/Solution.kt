package pawanroy.leetcode.`387-first-unique-character-in-a-string`

class Solution {
    val occurrence = IntArray(256) { 0 }
    fun firstUniqChar(s: String): Int {
        for (c in s.toCharArray()) occurrence[c - 'a'] += 1
        for (i in s.indices) if (occurrence[s[i] - 'a'] == 1) return i
        return -1
    }
}