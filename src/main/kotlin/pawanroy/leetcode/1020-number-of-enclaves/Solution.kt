package pawanroy.leetcode.`1020-number-of-enclaves`

@Suppress("kotlin:S3776")
class Solution {
    fun numEnclaves(grid: Array<IntArray>): Int {
        if (grid.isEmpty() || grid[0].isEmpty()) return 0
        val maxX = grid.size
        val maxY = grid[0].size


        // Remove all the land connected to boundary
        fun markAsWater(refX: Int, refY: Int) {
            if (grid[refX][refY] == 0) return
            grid[refX][refY] = 0
            if (refX + 1 < maxX) markAsWater(refX + 1, refY)
            if (refX - 1 > -1) markAsWater(refX - 1, refY)
            if (refY + 1 < maxY) markAsWater(refX, refY + 1)
            if (refY - 1 > -1) markAsWater(refX, refY - 1)
        }

        for (i in grid.indices) {
            markAsWater(i, 0)
            markAsWater(i, maxY - 1)
        }
        for (j in grid[0].indices) {
            markAsWater(0, j)
            markAsWater(maxX - 1, j)
        }

        var count = 0
        // Count all the remaining land
        for (i in 1 until grid.lastIndex)
            for (j in 1 until grid[0].lastIndex)
                count += grid[i][j]
        return count
    }
}