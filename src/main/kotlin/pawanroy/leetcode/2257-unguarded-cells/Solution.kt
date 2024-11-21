package pawanroy.leetcode.`2257-unguarded-cells`

class Solution {
    val wall = 5
    val guard = 4
    val vertical = 2
    val horizonal = 1
    val empty = 0
    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        val grid = Array(m) { IntArray(n) { 0 } }
        var count = 0
        guards.forEach { grid[it[0]][it[1]] = guard }
        walls.forEach { grid[it[0]][it[1]] = wall }

        grid.forEachIndexed { r, row ->
            row.forEachIndexed { c, cell ->
                if (cell == guard) {
                    var i = 1
                    while (c - i >= 0) {
                        if (grid[r][c - i] !in arrayOf(guard, wall)) {
                            if (grid[r][c - i] == empty) {
                                grid[r][c - i] = horizonal
                                count--
                            }
                        } else {
                            break
                        }
                        i++
                    }
                    i = 1
                    while (r - i >= 0) {
                        if (grid[r - i][c] !in arrayOf(guard, wall)) {
                            if (grid[r - i][c] == empty) {
                                count--
                                grid[r-i][c] = vertical
                            }
                        } else {
                            break
                        }
                        i++
                    }
                    return@forEachIndexed
                }
                if (cell == wall) {
                    return@forEachIndexed
                }

                if (r > 0 && (grid[r - 1][c] == guard || grid[r - 1][c] == vertical)) {
                    grid[r][c] = vertical
                }

                if (c > 0 && (grid[r][c - 1] == guard || grid[r][c - 1] == horizonal)) {
                    if (grid[r][c] == vertical) {
                        grid[r][c] = guard
                    } else {
                        grid[r][c] = horizonal
                    }
                }

                if (grid[r][c] == empty) {
                    count++
                }
            }
        }

        return count
    }
}