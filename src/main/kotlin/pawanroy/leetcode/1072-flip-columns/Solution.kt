package pawanroy.leetcode.`1072-flip-columns`

import java.util.*


class Solution {
    fun maxEqualRowsAfterFlips(matrix: Array<IntArray>): Int {
        val count: MutableMap<String, Int> = HashMap()

        for (row in matrix) {
            val key = StringBuilder()

            if (row[0] == 1) {
                for (n in row) {
                    key.append(if (n == 0) 1 else 0)
                }
            } else {
                for (n in row) {
                    key.append(n)
                }
            }

            count.merge(key.toString(), 1) { i: Int?, i1: Int? -> Integer.sum(i!!, i1!!) }
        }

        return Collections.max(count.values)
    }
}