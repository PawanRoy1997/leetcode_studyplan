package pawanroy.leetcode.`54-spiral-matrix`

class Solution {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val res = ArrayList<Int>()
        val visited = Array(matrix.size) { BooleanArray(matrix[0].size) { false } }

        val maxX = matrix[0].size
        val maxY = matrix.size
        val size = maxX * maxY

        var direction = 1
        var x = 0
        var y = 0

        while (true) {
            if (!visited[y][x]) res.add(matrix[y][x])
            visited[y][x] = true
            if (res.size == size) break
            if (direction == 1) {
                if (x + 1 == maxX || visited[y][x + 1]) {
                    direction = 2
                } else x += 1
            }
            if (direction == 2) {
                if (y + 1 == maxY || visited[y + 1][x]) {
                    direction = 3
                } else y += 1
            }
            if (direction == 3) {
                if (x - 1 == -1 || visited[y][x - 1]) {
                    direction = 4
                } else x -= 1
            }

            if (direction == 4) {
                if (y - 1 == 0 || visited[y - 1][x]) {
                    direction = 1
                } else y -= 1
            }
        }
        return res.toList()
    }
}