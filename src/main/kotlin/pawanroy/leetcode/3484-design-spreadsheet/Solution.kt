package pawanroy.leetcode.`3484-design-spreadsheet`

class Spreadsheet(rows: Int) {
    private val grid = Array(rows) { IntArray(26) { 0 } }

    fun setCell(cell: String, value: Int) {
        val col = cell.first() - 'A'
        val row = cell.drop(1).toInt() - 1
        grid[row][col] = value
    }

    fun resetCell(cell: String) {
        setCell(cell, 0)
    }

    fun getValue(formula: String): Int {
        return if (formula.startsWith('=')) {
            val f = formula.drop(1).split("+")
            val a = if (f[0][0].isDigit()) {
                f[0].toInt()
            } else getCellValue(f[0])
            val b = if (f[1][0].isDigit()) {
                f[1].toInt()
            } else getCellValue(f[1])
            a + b
        } else {
            getCellValue(formula)
        }
    }

    private fun getCellValue(ref: String): Int {
        val col = ref.first() - 'A'
        val row = ref.substring(1).toInt() - 1
        return grid[row][col]
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * var obj = Spreadsheet(rows)
 * obj.setCell(cell,value)
 * obj.resetCell(cell)
 * var param_3 = obj.getValue(formula)
 */