package pawanroy.leetcode.`37-suduko-solver`

import java.util.Stack

class Solution {
    private lateinit var solution: Array<IntArray>

    fun solveSudoku(board: Array<CharArray>) {
        val numericBoard = numericBoardCreate(board)
        if(solver(0, 0, numericBoard)) {
            for (column in board.indices) {
                board[column] = solution[column].joinToString(prefix = "", postfix = "", separator = "").toCharArray()
            }
        }else{
            for (column in board.indices) {
                board[column] = charArrayOf('1','1','1','1','1','1','1','1','1')
            }
        }
    }

    private fun solver(row: Int, column: Int, board: Array<IntArray>): Boolean {
        val newRow = if (column == 8) row + 1 else row
        val newColumn = if (column == 8) 0 else column + 1
        return if(row == 9){
            solution = board
            true
        } else if (board[column][row] == 0) {
            val rowQ = (row/3)*3
            val colQ = (column/3)*3
            val stack = Stack<Int>()
            for(i in 9 downTo 1) stack.push(i)
            var res = false

            for(r in 0..2) for(c in 0..2){ stack.remove(board[c+colQ][r+rowQ]) }
            for(i in 0..8){ stack.remove(board[i][row]); stack.remove(board[column][i]) }
            while(stack.isNotEmpty() && !res){
                board[column][row] = stack.pop()
                res = solver(newRow, newColumn, board)
            }
            if(!res) board[column][row] = 0
            res
        } else {
            solver(newRow, newColumn, board)
        }
    }

    private fun numericBoardCreate(board: Array<CharArray>): Array<IntArray> {
        return Array(9) { column ->
            IntArray(9) { row ->
                if (board[column][row].isDigit()) board[column][row].digitToInt() else 0
            }
        }
    }
}