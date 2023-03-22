package pawanroy.leetcode.`118-pascal's-triangle`

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        if (numRows == 0) return emptyList()
        result.add(listOf(1))
        for (i in 1 until numRows) {
            result.add(
                List(i + 1) {
                    if (it == 0) result[i - 1][it]
                    else if (it == i) result[i - 1][it - 1]
                    else result[i - 1][it] + result[i - 1][it - 1]
                }
            )
        }
        return result
    }
}