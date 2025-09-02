package pawanroy.leetcode.`3025-number-of-ways-to-place-people`

class Solution {
    fun numberOfPairs(points: Array<IntArray>): Int {
        val n = points.size
        var ans = 0

        // Sort points by x ascending, then y descending (important for pruning)
        val sorted = points.sortedWith(compareBy<IntArray> { it[0] }.thenByDescending { it[1] })

        for (i in 0 until n) {
            val a = sorted[i]
            for (j in i + 1 until n) {
                val b = sorted[j]

                // A must be on top-left of B
                if (!(a[0] <= b[0] && a[1] >= b[1])) continue

                var illegal = false
                for (k in i + 1 until j) {
                    val mid = sorted[k]
                    if (mid[0] in a[0]..b[0] && mid[1] in b[1]..a[1]) {
                        illegal = true
                        break
                    }
                }

                if (!illegal) ans++
            }
        }
        return ans
    }
}
