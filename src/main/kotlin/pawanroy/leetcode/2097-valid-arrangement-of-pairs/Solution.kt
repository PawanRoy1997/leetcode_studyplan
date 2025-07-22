package pawanroy.leetcode.`2097-valid-arrangement-of-pairs`

class Solution {

    fun validArrangement(pairs: Array<IntArray>): Array<IntArray> {
        val m = mutableMapOf<Int, MutableList<Int>>()
        val f = mutableMapOf<Int, Int>()
        for ((a, b) in pairs) {
            m.getOrPut(a) { mutableListOf() } += b
            f[a] = 1 + (f[a] ?: 0)
            f[b] = -1 + (f[b] ?: 0)
        }
        val first = f.keys.firstOrNull { f[it]!! > 0 } ?: pairs[0][0]
        val stack = mutableListOf(first, -1); var prev: Int
        return Array(pairs.size) { i ->
            do {
                prev = stack.removeLast()
                while ((m[stack.last()]?.size ?: 0) > 0)
                    stack += m[stack.last()]!!.removeLast()
            } while (prev < 0)
            intArrayOf(stack.last(), prev)
        }.apply { reverse() }
    }
}