package pawanroy.leetcode.`1900-earliest-and-latest-rounds`

class Solution {
    fun earliestAndLatest(n: Int, firstPlayer: Int, secondPlayer: Int): IntArray {
        var p1 = minOf(firstPlayer, secondPlayer)
        var p2 = maxOf(firstPlayer, secondPlayer)

        if (p1 + p2 == n + 1) { return intArrayOf(1, 1) }

        if (n <= 4) { return intArrayOf(2, 2) }

        val m = (n + 1) / 2
        var minRound = Int.Companion.MAX_VALUE
        var maxRound = Int.Companion.MIN_VALUE

        if (p1 - 1 > n - p2) {
            val t = n + 1 - p1
            p1 = n + 1 - p2
            p2 = t
        }

        if (p2 * 2 <= n + 1) {
            val a = p1 - 1
            val b = p2 - p1 - 1

            for (i in 0..a) {
                for (j in 0..b) {
                    val next = earliestAndLatest(m, i + 1, i + j + 2)
                    minRound = minOf(minRound, next[0] + 1)
                    maxRound = maxOf(maxRound, next[1] + 1)
                }
            }
        } else {
            val p4 = n + 1 - p2
            val a = p1 - 1
            val b = p4 - p1 - 1
            val c = p2 - p4 - 1

            for (i in 0..a) {
                for (j in 0..b) {
                    val offset = i + j + 1 + (c + 1) / 2 + 1
                    val next = earliestAndLatest(m, i + 1, offset)
                    minRound = minOf(minRound, next[0] + 1)
                    maxRound = maxOf(maxRound, next[1] + 1)
                }
            }
        }

        return intArrayOf(minRound, maxRound)
    }
}