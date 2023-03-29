package pawanroy.leetcode.`438-find-all-anagrams-in-a-string`

class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (s.length < p.length) return listOf(0)
        if (p.isEmpty()) return List(s.length) { it }

        val ref = IntArray(256) { 0 }
        val ptr = IntArray(256) { 0 }

        val h = HashSet<Int>()
        for (i in p.indices) {
            ref[p[i].toIndex()]++
            ptr[s[i].toIndex()]++
            h.add(p[i].toIndex())
        }

        var r: Boolean
        val result = ArrayList<Int>()
        for (i in 0..s.length - p.length) {
            if (i > 0) {
                ptr[s[i + p.lastIndex].toIndex()]++
                ptr[s[i - 1].toIndex()]--
            }
            r = true

            for (j in h) if (ref[j] != ptr[j]) {
                r = false;break
            }

            if (r) result.add(i)
        }

        return result
    }

    private fun Char.toIndex() = this - 'a'
}