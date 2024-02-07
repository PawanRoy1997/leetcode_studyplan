package pawanroy.leetcode.`49-group-anagrams`

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = ArrayList<List<String>>()
        val isOccupied = BooleanArray(strs.size) { false }

        for (i in strs.indices) {
            if (isOccupied[i]) continue
            isOccupied[i] = true
            val l = ArrayList<String>()
            l.add(strs[i])
            for (j in i + 1..strs.lastIndex) {
                if(isAnagram(strs[i], strs[j])){
                    l.add(strs[j])
                    isOccupied[j] = true
                }
            }
            result.add(l)
        }

        return result
    }

    private fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val hSet = HashSet<Char>()
        val count = IntArray(256) { 0 }

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