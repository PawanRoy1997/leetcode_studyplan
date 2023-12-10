package pawanroy.leetcode.`867-transpose-matrix`

class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val result = ArrayList<IntArray>()
        val item = ArrayList<Int>()
        for (row in matrix.first().indices) {
            for(col in matrix.indices) item.add(matrix[col][row])
            result.add(item.toIntArray())
            item.clear()
        }

        return result.toTypedArray()
    }
}