package pawanroy.leetcode.`799-champagne-tower`

class Solution {
    fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double {
        val tower = ArrayList<ArrayList<Double>>()
        tower.add(arrayListOf(poured.toDouble()))

        for (row in 0 until query_row) {
            val list = ArrayList<Double>()

            for (glass in tower[row].indices) {
                val left = if (glass == 0 || tower[row][glass - 1] <= 1) 0.0 else (tower[row][glass - 1] - 1) / 2
                val right = if (tower[row][glass] <= 1) 0.0 else (tower[row][glass] - 1) / 2

                list.add(left + right)
            }

            if (tower[row].last() <= 1) list.add(0.0) else list.add((tower[row].last() - 1) / 2)
            tower.add(list)
        }

        return if (tower[query_row][query_glass] < 1) tower[query_row][query_glass] else 1.0
    }
}