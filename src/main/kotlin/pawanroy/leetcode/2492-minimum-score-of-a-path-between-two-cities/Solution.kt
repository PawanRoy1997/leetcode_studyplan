package pawanroy.leetcode.`2492-minimum-score-of-a-path-between-two-cities`

import java.lang.Integer.min
import java.util.*

@Suppress("kotlin:S3776")
class Solution {

    fun minScore(n: Int, roads: Array<IntArray>): Int {
        val q: Queue<Int> = LinkedList()
        val isSeen = BooleanArray(n + 1)
        var listMin = Int.MAX_VALUE

        for (path in roads) listMin = min(listMin, path[2])


        q.offer(1)

        var min = Int.MAX_VALUE

        while (q.isNotEmpty()) {
            val node = q.poll()

            isSeen[node] = true

            for (path in roads) if (path[0] == node && !isSeen[path[1]]
                || path[1] == node && !isSeen[0]
            ) {
                min = min(min, path[2])
                if (path[1] == node) q.offer(path[0]) else q.offer(path[1])
            }

            if (min == listMin) break
        }

        return min
    }
}