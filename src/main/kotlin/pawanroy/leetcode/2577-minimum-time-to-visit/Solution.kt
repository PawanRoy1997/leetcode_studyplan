package pawanroy.leetcode.`2577-minimum-time-to-visit`

import java.util.*

class Solution {
    fun minimumTime(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size

        if (grid[0][1] > 1 && grid[1][0] > 1) {
            return -1
        }

        val pq = PriorityQueue { a: IntArray, b: IntArray -> a[0] - b[0] }
        val seen = Array(rows) { BooleanArray(cols) }

        pq.offer(intArrayOf(0, 0, 0)) // time, row, col
        seen[0][0] = true

        while (!pq.isEmpty()) {
            val curr = pq.poll()
            val time = curr[0]
            val row = curr[1]
            val col = curr[2]

            for (dir in MOVES) {
                val newRow = row + dir[0]
                val newCol = col + dir[1]

                if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols ||
                    seen[newRow][newCol]
                ) {
                    continue
                }

                var newTime = time + 1
                if (grid[newRow][newCol] > newTime) {
                    val wait = ((grid[newRow][newCol] - newTime + 1) / 2) * 2
                    newTime += wait
                }

                if (newRow == rows - 1 && newCol == cols - 1) {
                    return newTime
                }

                seen[newRow][newCol] = true
                pq.offer(intArrayOf(newTime, newRow, newCol))
            }
        }

        return -1
    }

    private val MOVES = arrayOf(intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1))
}