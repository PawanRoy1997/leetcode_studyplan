package pawanroy.leetcode.isomorphic_strings

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val mapS = IntArray(256){-1}
        val mapT = IntArray(256){-1}

        for(i in s.indices) {
            val c1: Int = s[i].code
            val c2: Int = t[i].code

            if(mapS[c1] == -1 && mapT[c2] == -1) {
                mapS[c1] = c2
                mapT[c2] = c1
            } else if(!(mapS[c1] == c2 && mapT[c2] ==
                        c1)) {
                return false
            }
        }
        return true
    }
}