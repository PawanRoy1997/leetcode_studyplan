package pawanroy.leetcode.min_cost_climbing_stairs

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var cursor = -1
        var totalCost = 0
        while (cursor < cost.size) {
            if (cursor == cost.lastIndex) break
            if (cursor == cost.lastIndex-1) break
            val sides = cost[cursor + 1] + if (cost.size > cursor + 3) cost[cursor + 3] else 0
            val middle = if (cursor + 2 < cost.size) cost[cursor + 2] else 0
            totalCost = if (middle < sides) {
                cursor += 2
                totalCost + cost[cursor]
            } else {
                cursor += 3
                sides
            }
        }
        return totalCost
    }
}