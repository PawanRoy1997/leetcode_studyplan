package pawanroy.leetcode.`1572-matrix-diagonal-sum`

class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        if (mat.isEmpty()) return 0
        var sum = 0
        val col = mat.first().lastIndex

        if (col % 2 == 0) sum -= mat[col / 2][col / 2]

        for (row in mat.indices) {
            sum += mat[row][row]
            sum += mat[row][col - row]
            if (col == row) break
        }

        return sum
    }
}