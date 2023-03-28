package pawanroy.leetcode.`62-unique-paths`

class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val grid = Array(m) { IntArray(n) { 1 } }

        for (i in 1 until m) for (j in 1 until n) grid[i][j] = grid[i - 1][j] + grid[i][j - 1]

        return grid[m - 1][n - 1]
    }
}