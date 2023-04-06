package pawanroy.leetcode.`1254-numbre-of-close-islands`

class Solution {

    @Suppress("kotlin:S3776")
    fun closedIsland(grid: Array<IntArray>): Int {
        if (grid.isEmpty() || grid[0].isEmpty()) return 0
        var count = 0

        fun markAs(refX: Int, refY: Int, marked: Int) {
            grid[refX][refY] = marked
            if (refX - 1 > -1 && grid[refX - 1][refY] == 0) markAs(refX - 1, refY, marked)
            if (refX + 1 < grid.size && grid[refX + 1][refY] == 0) markAs(refX + 1, refY, marked)
            if (refY - 1 > -1 && grid[refX][refY - 1] == 0) markAs(refX, refY - 1, marked)
            if (refY + 1 < grid[0].size && grid[refX][refY + 1] == 0) markAs(refX, refY + 1, marked)
        }

        // Mark border lands as water
        for (i in 0..grid.lastIndex) {
            if (i == 0 || i == grid.lastIndex) for (j in grid[0].indices) {
                if (grid[i][j] == 0) markAs(i, j, 1)
            }
            else for (j in intArrayOf(0, grid[0].lastIndex)) {
                if (grid[i][j] == 0) markAs(i, j, 1)
            }
        }
        // Find land and Make all connected lands as 2,3,4...n

        for (i in 1 until grid.lastIndex) for (j in 1..grid[0].lastIndex)
            if (grid[i][j] == 0) {
                count++
                markAs(i, j, count)
            }

        // return n
        return count
    }
}