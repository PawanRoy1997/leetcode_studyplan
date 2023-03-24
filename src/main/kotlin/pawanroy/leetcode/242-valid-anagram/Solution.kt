package pawanroy.leetcode.`242-valid-anagram`

class Solution {
    val sOcc = IntArray(256) { 0 }
    val tOcc = IntArray(256) { 0 }
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val hSet = HashSet<Char>()
        for (c in s.toCharArray()) {
            sOcc[c - 'a'] += 1
            hSet.add(c)
        }
        for (c in t.toCharArray()) tOcc[c - 'a'] += 1

        for (c in hSet) {
            if (tOcc[c - 'a'] != sOcc[c - 'a']) return false
        }

        return true

    }
}