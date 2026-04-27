package pawanroy.leetcode.`1391-check-valid-path`

class Solution {

    private val dirs = arrayOf(
        intArrayOf(0, -1),  // left
        intArrayOf(0, 1),   // right
        intArrayOf(-1, 0),  // up
        intArrayOf(1, 0)    // down
    )

    // street type → allowed directions
    private val streetMap = mapOf(
        1 to listOf(0, 1),        // left, right
        2 to listOf(2, 3),        // up, down
        3 to listOf(0, 3),        // left, down
        4 to listOf(1, 3),        // right, down
        5 to listOf(0, 2),        // left, up
        6 to listOf(1, 2)         // right, up
    )

    // opposite direction
    private fun opposite(dir: Int): Int {
        return when (dir) {
            0 -> 1
            1 -> 0
            2 -> 3
            else -> 2
        }
    }

    fun hasValidPath(grid: Array<IntArray>): Boolean {
        val m = grid.size
        val n = grid[0].size
        val visited = Array(m) { BooleanArray(n) }

        fun dfs(r: Int, c: Int): Boolean {
            if (r == m - 1 && c == n - 1) return true

            visited[r][c] = true

            val type = grid[r][c]

            for (dir in streetMap[type]!!) {
                val nr = r + dirs[dir][0]
                val nc = c + dirs[dir][1]

                if (nr !in 0 until m || nc !in 0 until n) continue
                if (visited[nr][nc]) continue

                val nextType = grid[nr][nc]

                // check if next cell connects back
                if (opposite(dir) in streetMap[nextType]!!) {
                    if (dfs(nr, nc)) return true
                }
            }

            return false
        }

        return dfs(0, 0)
    }
}