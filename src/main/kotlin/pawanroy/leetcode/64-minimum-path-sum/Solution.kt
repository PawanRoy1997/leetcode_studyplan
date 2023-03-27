package pawanroy.leetcode.`64-minimum-path-sum`

class Solution {

    fun minPathSum(grid: Array<IntArray>): Int {
        if (grid.isEmpty() || grid[0].isEmpty()) return 0
        for (x in grid.indices) for (y in grid[0].indices) {
            if (x > 0 && y > 0) grid[x][y] += minOf(grid[x - 1][y], grid[x][y - 1])
            else if (x > 0 && y == 0) grid[x][y] += grid[x - 1][y]
            else if (x == 0 && y > 0) grid[x][y] += grid[x][y - 1]
        }
        return grid[grid.lastIndex][grid[0].lastIndex]
    }
}