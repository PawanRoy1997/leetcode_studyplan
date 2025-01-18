package pawanroy.leetcode.`1368-minimum-cost-to-valid-path`

import java.util.*

class Solution {
    fun minCost(grid: Array<IntArray>): Int {
        val maxX = grid.lastIndex
        val maxY = grid.first().lastIndex

        val xDirection = intArrayOf(0, 0, 0, 1, -1)
        val yDirection = intArrayOf(0, 1, -1, 0, 0)

        val cost = Array(grid.size) { IntArray(grid.first().size) { Int.MAX_VALUE } }
        val q: Queue<Pair<Int, Int>> = LinkedList()
        cost[0][0] = 0
        q.add(Pair(0, 0))

        while (q.isNotEmpty()) {
            val tile = q.poll()

            if (tile.first == maxX && tile.second == maxY) continue
            val xDir = xDirection[grid[tile.first][tile.second]]
            val yDir = yDirection[grid[tile.first][tile.second]]

            if (
                tile.first + xDir in 0..maxX &&
                tile.second + yDir in 0..maxY &&
                cost[tile.first + xDir][tile.second + yDir] > cost[tile.first][tile.second]
            ) {
                cost[tile.first + xDir][tile.second + yDir] = cost[tile.first][tile.second]
                q.add(Pair(tile.first + xDir, tile.second + yDir))
            }

            if (
                tile.first + 1 in 0..maxX &&
                cost[tile.first + 1][tile.second] > cost[tile.first][tile.second] + 1
            ) {
                cost[tile.first + 1][tile.second] = cost[tile.first][tile.second] + 1
                q.add(Pair(tile.first + 1, tile.second))
            }
            if (
                tile.first - 1 in 0..maxX &&
                cost[tile.first - 1][tile.second] > cost[tile.first][tile.second] + 1
            ) {
                cost[tile.first - 1][tile.second] = cost[tile.first][tile.second] + 1
                q.add(Pair(tile.first - 1, tile.second))
            }
            if (
                tile.second + 1 in 0..maxY &&
                cost[tile.first][tile.second + 1] > cost[tile.first][tile.second] + 1
            ) {
                cost[tile.first][tile.second + 1] = cost[tile.first][tile.second] + 1
                q.add(Pair(tile.first, tile.second + 1))
            }
            if (
                tile.second - 1 in 0..maxY &&
                cost[tile.first][tile.second - 1] > cost[tile.first][tile.second] + 1
            ) {
                cost[tile.first][tile.second - 1] = cost[tile.first][tile.second] + 1
                q.add(Pair(tile.first, tile.second - 1))
            }
        }

        return cost[maxX][maxY]
    }
}