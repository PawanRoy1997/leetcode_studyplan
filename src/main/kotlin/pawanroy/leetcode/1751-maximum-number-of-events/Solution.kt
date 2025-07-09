package pawanroy.leetcode.`1751-maximum-number-of-events`

import java.util.*

class Solution {
    fun maxValue(events: Array<IntArray>, k: Int): Int {
        Arrays.sort(events, Comparator { a, b -> a[1] - b[1] })
        val n = events.size

        val dp = Array(n + 1) { IntArray(k + 1) { 0 } }

        for (i in 1..n) {
            val event = events[i - 1]
            val prev = binarySearch(events, event[0])

            for (j in 1..k) {
                dp[i][j] = maxOf(dp[i - 1][j], dp[prev + 1][j - 1] + event[2])
            }
        }
        return dp[n][k]
    }

    private fun binarySearch(events: Array<IntArray>, currentStart: Int): Int {
        var left = 0
        var right = events.size - 1
        var result = -1

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (events[mid][1] < currentStart) {
                result = mid
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return result
    }
}