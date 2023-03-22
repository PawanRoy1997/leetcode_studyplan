package pawanroy.leetcode.`556-reshape-matix`

class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat.first().size != r * c) return mat

        val result = Array(r) { IntArray(c) }
        var row = 0
        var col = 0
        for (arr in mat) {
            for (num in arr) {
                result[row][col] = num
                col++
                if (col == c) {
                    col = 0;row++
                }
            }
        }

        return result
    }
}