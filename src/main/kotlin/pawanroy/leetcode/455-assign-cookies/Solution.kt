package pawanroy.leetcode.`455-assign-cookies`

import java.util.*

class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        Arrays.sort(g)
        Arrays.sort(s)
        var ptr = 0
        var count = 0
        g.forEach { greed ->
            if (ptr != s.size) {
                if (greed <= s[ptr]) {
                    ptr++
                    count++
                } else {
                    while (ptr < s.lastIndex && s[ptr] < greed) {
                        ptr++
                    }
                    if (s[ptr] >= greed) {
                        count++
                        ptr++
                    }
                }
            }
        }
        return count
    }
}