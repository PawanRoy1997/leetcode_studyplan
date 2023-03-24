package pawanroy.leetcode.`74-search-a-2d-matrix`

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val lastX = matrix[0].lastIndex
        fun checkY(start: Int, end: Int): Int {
            if (start == end) return start
            val i = start + (end - start) / 2
            if (target < matrix[i][0]) return checkY(start, i)
            if (target > matrix[i][lastX]) return checkY(i + 1, end)
            return i
        }

        fun checkX(start: Int, end: Int, y: Int): Boolean {
            if (start == end) return (matrix[y][start] == target)
            val i = start + (end - start) / 2
            if (matrix[y][i] < target) return checkX(i + 1, end, y)
            return checkX(start, i, y)
        }

        val y = checkY(0, matrix.lastIndex)
        return checkX(0, lastX, y)
    }
}