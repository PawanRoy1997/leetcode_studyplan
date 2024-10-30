package pawanroy.leetcode.`2684-maximum-number-of-moves-in-a-grid`

import java.util.*

class Solution {
    fun maxMoves(grid: Array<IntArray>): Int {
        val stack = Stack<Pair<Int, Int>>()

        val isOk = Array(grid.size) { BooleanArray(grid.first().size) { true } }

        for (i in grid.indices) stack.add(Pair(i, 0))

        var res = 0

        while (stack.isNotEmpty() && res < grid.first().lastIndex) {
            val cur = stack.pop()
            if (cur.second == grid.first().lastIndex) {
                res = grid.first().lastIndex
                continue
            }

            if (cur.first - 1 in grid.indices && isOk[cur.first - 1][cur.second + 1] && grid[cur.first - 1][cur.second + 1] > grid[cur.first][cur.second]) {
                stack.push(Pair(cur.first - 1, cur.second + 1))
                isOk[cur.first - 1][cur.second + 1] = false
            }

            if (cur.first in grid.indices && isOk[cur.first][cur.second + 1] && grid[cur.first][cur.second + 1] > grid[cur.first][cur.second]) {
                stack.push(Pair(cur.first, cur.second + 1))
                isOk[cur.first][cur.second + 1] = false
            }

            if (cur.first + 1 in grid.indices && isOk[cur.first + 1][cur.second + 1] && grid[cur.first + 1][cur.second + 1] > grid[cur.first][cur.second]) {
                stack.push(Pair(cur.first + 1, cur.second + 1))
                isOk[cur.first + 1][cur.second + 1] = false
            }

            res = maxOf(res, cur.second)
        }

        return res
    }
}