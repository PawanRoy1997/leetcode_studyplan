package pawanroy.leetcode.`200-number-of-islands`

class Solution {

    fun numIslands(grid: Array<CharArray>): Int {
        var islands = 0
        val rows = grid.size
        val columns = grid.first().size
        grid.forEachIndexed { row, cols ->
            cols.forEachIndexed { column, value ->
                if (value == '1') {
                    islands++
                    fillIslands(grid, row, column, rows, columns)
                }
            }
        }
        return islands
    }

    private fun fillIslands(grid: Array<CharArray>, row: Int, column: Int, rows: Int, columns: Int) {
        if (row < 0 || column < 0 || row == rows || column == columns || grid[row][column] == '0') return
        grid[row][column] = '0'
        fillIslands(grid, row + 1, column, rows, columns)
        fillIslands(grid, row - 1, column, rows, columns)
        fillIslands(grid, row, column + 1, rows, columns)
        fillIslands(grid, row, column - 1, rows, columns)
    }
}