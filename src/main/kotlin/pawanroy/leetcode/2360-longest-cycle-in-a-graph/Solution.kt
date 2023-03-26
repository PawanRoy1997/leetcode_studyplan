package pawanroy.leetcode.`2360-longest-cycle-in-a-graph`

class Solution {
    fun longestCycle(edges: IntArray): Int {
        var longestCycleLen = -1
        var timeStep = 1
        val nodeVisitedAtTime = IntArray(edges.size)
        for (currentNode in edges.indices) {
            if (nodeVisitedAtTime[currentNode] > 0) continue
            val startTime = timeStep
            var u = currentNode
            while (u != -1 && nodeVisitedAtTime[u] == 0) {
                nodeVisitedAtTime[u] = timeStep++
                u = edges[u]
            }
            if (u != -1 && nodeVisitedAtTime[u] >= startTime) longestCycleLen =
                Math.max(longestCycleLen, timeStep - nodeVisitedAtTime[u])
        }
        return longestCycleLen
    }
}
