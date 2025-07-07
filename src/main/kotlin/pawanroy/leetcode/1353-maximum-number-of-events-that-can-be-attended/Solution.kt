package pawanroy.leetcode.`1353-maximum-number-of-events-that-can-be-attended`

import java.util.*
import kotlin.math.max


internal class Solution {
    fun maxEvents(events: Array<IntArray>): Int {
        val n = events.size
        var maxDay = 0
        for (event in events) {
            maxDay = max(maxDay, event[1])
        }

        val pq = PriorityQueue<Int?>()
        Arrays.sort(events, Comparator { a: IntArray?, b: IntArray? -> a!![0] - b!![0] })
        var ans = 0
        var i = 1
        var j = 0
        while (i <= maxDay) {
            while (j < n && events[j][0] <= i) {
                pq.offer(events[j][1])
                j++
            }
            while (!pq.isEmpty() && pq.peek()!! < i) {
                pq.poll()
            }
            if (!pq.isEmpty()) {
                pq.poll()
                ans++
            }
            i++
        }

        return ans
    }
}