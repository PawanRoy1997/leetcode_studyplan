package pawanroy.leetcode.`383-ransom-note`

class Solution {
    val rOcc = IntArray(256) { 0 }
    val mOcc = IntArray(256) { 0 }
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (ransomNote.length > magazine.length) return false
        val hSet = HashSet<Char>()
        for (c in ransomNote.toCharArray()) {
            rOcc[c - 'a'] += 1
            hSet.add(c)
        }
        for (c in magazine.toCharArray()) mOcc[c - 'a'] += 1

        for (c in hSet) {
            if (mOcc[c - 'a'] < rOcc[c - 'a']) return false
        }

        return true
    }
}