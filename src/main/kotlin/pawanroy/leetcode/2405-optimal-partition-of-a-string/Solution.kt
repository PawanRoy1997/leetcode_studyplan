package pawanroy.leetcode.`2405-optimal-partition-of-a-string`

class Solution {
    fun partitionString(s: String): Int {
        val res = ArrayList<String>()
        val sb = StringBuilder()
        for (char in s) {
            if (sb.contains(char)) {
                res.add(sb.toString())
                sb.clear()
            }
            sb.append(char)
        }
        res.add(sb.toString())
        return res.size
    }
}