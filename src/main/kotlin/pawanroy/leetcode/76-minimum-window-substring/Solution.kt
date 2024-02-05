package pawanroy.leetcode.`76-minimum-window-substring`


class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.isEmpty() || t.isEmpty()) {
            return ""
        }

        val dictT: MutableMap<Char, Int> = HashMap()
        for (c in t.toCharArray()) {
            val count = dictT.getOrDefault(c, 0)
            dictT[c] = count + 1
        }

        val required = dictT.size
        var l = 0
        var r = 0
        var formed = 0

        val windowCounts: MutableMap<Char, Int> = HashMap()
        val ans = intArrayOf(-1, 0, 0)

        while (r < s.length) {
            var c = s[r]
            val count = windowCounts.getOrDefault(c, 0)
            windowCounts[c] = count + 1

            if (dictT.containsKey(c) && windowCounts[c] == dictT[c]) {
                formed++
            }

            while (l <= r && formed == required) {
                c = s[l]

                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1
                    ans[1] = l
                    ans[2] = r
                }

                windowCounts[c] = windowCounts[c]!! - 1
                if (dictT.containsKey(c) && windowCounts[c]!! < dictT[c]!!) {
                    formed--
                }

                l++
            }

            r++
        }

        return if (ans[0] == -1) "" else s.substring(ans[1], ans[2] + 1)
    }
}
