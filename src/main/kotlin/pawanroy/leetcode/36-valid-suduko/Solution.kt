package pawanroy.leetcode.`36-valid-suduko`

@Suppress("kotlin:S3776")
class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val array1 = HashSet<Char>()
        val array2 = HashSet<Char>()
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                if (board[i][j] != '.' && array1.contains(board[i][j]))
                    return false
                else
                    array1.add(board[i][j])

                if (board[j][i] != '.' && array2.contains(board[j][i]))
                    return false
                else
                    array2.add(board[j][i])
            }
            array1.clear()
            array2.clear()
        }

        array1.clear()

        for (a in getRoomCoordinates(0)) for (b in getRoomCoordinates(0)) {
            for (i in getRoomCoordinates(a * 3)) for (j in getRoomCoordinates(b * 3)) {
                if (board[i][j] != '.' && array1.contains(board[i][j])) return false
                else array1.add(board[i][j])
            }
            array1.clear()
        }

        return true
    }

    fun getRoomCoordinates(x: Int): IntArray {
        return intArrayOf(x + 0, x + 1, x + 2)
    }
}