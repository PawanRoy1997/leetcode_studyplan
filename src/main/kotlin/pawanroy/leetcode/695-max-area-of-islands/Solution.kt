package pawanroy.leetcode.`695-max-area-of-islands`

class Solution {
    @Suppress("kotlin:S3776")
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        var max = 0

        val maxX = grid.lastIndex
        val maxY = grid[0].lastIndex

        fun areaOfIsland(x: Int, y: Int): Int {
            grid[x][y] = 0
            var res = 1
            if (x + 1 in 0..maxX && grid[x + 1][y] == 1) res += areaOfIsland(x + 1, y)
            if (x - 1 in 0..maxX && grid[x - 1][y] == 1) res += areaOfIsland(x - 1, y)
            if (y + 1 in 0..maxY && grid[x][y + 1] == 1) res += areaOfIsland(x, y + 1)
            if (y - 1 in 0..maxY && grid[x][y - 1] == 1) res += areaOfIsland(x, y - 1)
            return res
        }

        for (i in grid.indices) for (j in grid[0].indices) if (grid[i][j] == 1) max = maxOf(max, areaOfIsland(i, j))

        return max
    }
}