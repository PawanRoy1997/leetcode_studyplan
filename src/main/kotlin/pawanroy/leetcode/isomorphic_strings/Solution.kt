package pawanroy.leetcode.isomorphic_strings

private const val UNSET = -1
class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val mapS = IntArray(256){ UNSET }
        val mapT = IntArray(256){ UNSET }

        for(i in s.indices) {
            val c1: Int = s[i].code
            val c2: Int = t[i].code

            if(mapS[c1] == UNSET && mapT[c2] == UNSET) {
                mapS[c1] = c2
                mapT[c2] = c1
            } else if(!(mapS[c1] == c2 && mapT[c2] == c1)) {
                return false
            }
        }
        return true
    }
}