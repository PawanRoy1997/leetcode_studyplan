package pawanroy.leetcode.`3-longest-substring-without-repeating-characters`

import java.lang.Integer.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var res = 0
        if (s.isEmpty()) return 0
        val sb = ArrayList<Char>()
        s.forEach {
            while(sb.contains(it)){
                sb.removeAt(0)
            }
            sb.add(it)
            res = max(sb.size, res)
        }
        return max(res, sb.size)
    }
}