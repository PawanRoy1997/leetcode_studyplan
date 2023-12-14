package pawanroy.leetcode.`2482-difference-between-ones-and-zeros-in-row-and-column`

class Solution {
    fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
        val numRow = grid.size
        val oneRow = IntArray(numRow)
        val numCol = grid.first().size
        val oneCol = IntArray(numCol)
        val result = Array(numRow) { IntArray(numCol) }

        grid.forEachIndexed { rowIdx, row ->
            row.forEachIndexed { colIdx, cols ->
                oneRow[rowIdx] += cols
                oneCol[colIdx] += cols
            }
        }

        for (rowIdx in grid.indices) for (colIdx in grid.first().indices) {
            result[rowIdx][colIdx] =
                oneRow[rowIdx] + oneCol[colIdx] - (numRow - oneRow[rowIdx]) - (numCol - oneCol[colIdx])
        }

        return result
    }
}