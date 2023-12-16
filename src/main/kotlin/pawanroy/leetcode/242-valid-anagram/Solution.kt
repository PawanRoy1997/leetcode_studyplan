package pawanroy.leetcode.`242-valid-anagram`

class Solution {
    private val count = IntArray(256) { 0 }
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val hSet = HashSet<Char>()

        s.toCharArray().forEach {
            hSet.add(it)
            count[it - 'a'] += 1
        }
        t.toCharArray().forEach {
            hSet.add(it)
            count[it - 'a'] -= 1
        }

        for (c in hSet) {
            if (count[c - 'a'] != 0) return false
        }

        return true
    }
}