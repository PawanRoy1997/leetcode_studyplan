package pawanroy.leetcode.`2290-minimum-obstacles`

import java.util.*

class Solution {
    fun minimumObstacles(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val distance = Array(m) { IntArray(n) }
        for (row in distance) Arrays.fill(row, Int.MAX_VALUE)
        val dq: Deque<IntArray> = LinkedList()

        distance[0][0] = 0
        dq.offerFirst(intArrayOf(0, 0))
        val directions = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))

        while (!dq.isEmpty()) {
            val cell = dq.pollFirst()
            val x = cell[0]
            val y = cell[1]
            for (dir in directions) {
                val nx = x + dir[0]
                val ny = y + dir[1]
                if (nx in 0 until m && ny >= 0 && ny < n) {
                    val newDist = distance[x][y] + grid[nx][ny]
                    if (newDist < distance[nx][ny]) {
                        distance[nx][ny] = newDist
                        if (grid[nx][ny] == 0) {
                            dq.offerFirst(intArrayOf(nx, ny))
                        } else {
                            dq.offerLast(intArrayOf(nx, ny))
                        }
                    }
                }
            }
        }
        return distance[m - 1][n - 1]
    }
}