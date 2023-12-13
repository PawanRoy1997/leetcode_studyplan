package pawanroy.leetcode.`1582-special-positions-in-a-binary-matrix`

class Solution {
    fun numSpecial(mat: Array<IntArray>): Int {
        val result = ArrayList<Pair<Int, Int>>()
        val rowSum = IntArray(mat.size)
        val colSum = IntArray(mat.first().size)
        for (row in mat.indices) for (col in mat.first().indices) {
            if (mat[row][col] == 1) result.add(Pair(row, col))
            rowSum[row] += mat[row][col]
            colSum[col] += mat[row][col]
        }

        rowSum.forEachIndexed { index, row ->
            if (row > 1) result.filter { it.first == index }.forEach(result::remove)
        }
        colSum.forEachIndexed { index, col ->
            if (col > 1) result.filter { it.second == index }.forEach(result::remove)
        }


        return result.size
    }
}